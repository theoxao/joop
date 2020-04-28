package com.theoxao

import cc.hibay.com.theoxao.script.GitlabScriptSupplier
import com.theoxao.config.Mongo
import com.theoxao.repository.CommitRepository
import com.theoxao.repository.TreeNodeRepository
import com.theoxao.script.repo.DefaultScriptRepo
import freemarker.cache.ClassTemplateLoader
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.features.json.JacksonSerializer
import io.ktor.client.features.json.JsonFeature
import io.ktor.features.ContentNegotiation
import io.ktor.freemarker.FreeMarker
import io.ktor.jackson.jackson
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.util.KtorExperimentalAPI
import org.koin.core.context.startKoin
import org.koin.dsl.module
import org.koin.ktor.ext.inject

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@KtorExperimentalAPI
fun Application.main() = with(this) {
    install(FreeMarker) {
        templateLoader = ClassTemplateLoader(this::class.java.classLoader, "templates")
    }

    install(ContentNegotiation) {
        jackson()
    }

    val mongo = install(Mongo) {
        kmongo()
    }

    val client = HttpClient(OkHttp) {
        install(JsonFeature) {
            serializer = JacksonSerializer()
        }
    }

    startKoin {
        modules(
            module {
                single { client }
                single { mongo.mongoApplication }
            },
            module {
                single { CommitRepository(get()) }
                single { TreeNodeRepository(get()) }
            },
            module {
                single { GitlabScriptSupplier(get(), this@with.environment.config.config("joop")) }
                single { DefaultScriptRepo(get()) }
            }
        )
    }

    val scriptHandler by inject<DefaultScriptRepo>()
    scriptHandler.sync()
    routing {
        get("/") {
            scriptHandler.sync()
        }
    }
}

