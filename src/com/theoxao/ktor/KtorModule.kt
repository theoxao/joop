package com.theoxao.ktor

import com.theoxao.service.SqlService
import com.theoxao.service.VCSService
import io.ktor.application.Application
import io.ktor.application.ApplicationCall
import io.ktor.application.call
import io.ktor.freemarker.FreeMarkerContent
import io.ktor.http.content.resources
import io.ktor.http.content.static
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.post
import io.ktor.routing.route
import io.ktor.routing.routing
import org.koin.ktor.ext.inject
import java.lang.RuntimeException

/**
 * @author theo
 * @date 2020/4/28
 */

fun Application.base() = with(this) {

    val sqlService: SqlService by inject()
    val vcsService: VCSService by inject()

    routing {
        route("/joop") {
            get("/sql_script") {
                val id = this.call.request.queryParameters["id"]!!
                assert(id.contains("-"))
                this.call.respond(sqlService.getSqlScript(id))
            }
        }

        route("/git") {
            post("/refresh") {

            }
        }

    }

    //front resource routing and some api
    routing {
        get("/") {
            call.respond(FreeMarkerContent("index.ftl", null))
        }
        get("/schema") {
            call.respond(FreeMarkerContent("schema.ftl", null))
        }

        get("/schema/commit_options") {
            val branch = call.request.queryParameters["branch"] ?: "jooq-ext"
            val size = call.request.queryParameters["size"]?.toInt() ?: Int.MAX_VALUE
            val tagOnly = call.request.queryParameters["tagOnly"]?.toBoolean() ?: false
            val list = vcsService.getCommits(branch, size, tagOnly)
            call.respond(FreeMarkerContent("puzzle/commit_options.ftl", mapOf("list" to list)))
        }
        get("/version/decode") {
            val versionId =
                call.request.queryParameters["versionId"] ?: throw RuntimeException("version id is not provided")
            val result = vcsService.decodeVersion(versionId)
            call.respond(FreeMarkerContent("puzzle/commit_options.ftl", mapOf("list" to result)))
        }
        get("/schema/generate") {

        }

        get("/sp") {
            call.respond(FreeMarkerContent("sp.ftl", null))
        }

        get("/setting") {
            call.respond(FreeMarkerContent("setting.ftl", null))
        }

        static("/static") {
            resources("static/")
        }
    }
}

fun ApplicationCall.param(name: String): String? {
    return this.request.queryParameters[name]
}
