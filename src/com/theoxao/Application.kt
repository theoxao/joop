package cc.hibay.com.theoxao

import cc.hibay.com.theoxao.script.GitlabScriptSupplier
import com.theoxao.script.handler.DefaultScriptHandler
import com.theoxao.config.Mongo
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.http.*
import freemarker.cache.*
import io.ktor.freemarker.*
import io.ktor.gson.*
import io.ktor.features.*
import io.ktor.client.*
import io.ktor.client.engine.jetty.*
import io.ktor.client.features.json.*
import io.ktor.util.KtorExperimentalAPI
import org.koin.core.context.startKoin
import org.koin.dsl.module

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@KtorExperimentalAPI
fun Application.main() = with(this) {
    install(FreeMarker) {
        templateLoader = ClassTemplateLoader(this::class.java.classLoader, "templates")
    }

    install(ContentNegotiation) {
        gson()
    }

    val mongo = install(Mongo) {
        kmongo()
    }

    val client = HttpClient(Jetty) {
        install(JsonFeature) {
            serializer = GsonSerializer()
        }
    }

    startKoin {
        modules(
            module {
                single { client }
                single { mongo.mongoApplication }
            },
            module {
                single { GitlabScriptSupplier(get(), this@with.environment.config.config("gitlab")) }
                single { DefaultScriptHandler(get()) }
            }
        )
    }

    routing {
        get("/") {
            call.respondText("HELLO WORLD!", contentType = ContentType.Text.Plain)
        }
    }
}

