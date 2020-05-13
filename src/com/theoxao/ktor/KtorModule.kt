package com.theoxao.ktor

import com.theoxao.service.SqlService
import com.theoxao.service.VCSService
import io.ktor.application.Application
import io.ktor.application.ApplicationCall
import io.ktor.application.call
import io.ktor.http.content.file
import io.ktor.http.content.resources
import io.ktor.http.content.static
import io.ktor.response.respond
import io.ktor.routing.get
import io.ktor.routing.route
import io.ktor.routing.routing
import org.koin.ktor.ext.inject

/**
 * @author theo
 * @date 2020/4/28
 */

fun Application.base() = with(this) {

    val sqlService: SqlService by inject()
    val vcsService: VCSService by inject()

    routing {

        route("/api") {
            get("/schema/commit_options") {
                val branch = call.request.queryParameters["branch"] ?: "jooq-ext"
                val size = call.request.queryParameters["size"]?.toInt() ?: Int.MAX_VALUE
                val tagOnly = call.request.queryParameters["tagOnly"]?.toBoolean() ?: false
                val list = vcsService.getCommits(branch, size, tagOnly)
                call.respond(list)
            }
            get("/version/decode") {
                val versionId =
                    call.request.queryParameters["versionId"] ?: throw RuntimeException("version id is not provided")
                val result = vcsService.decodeVersion(versionId)
                call.respond(result)
            }

            get("/generate") {
                val current = call.request.queryParameters["current"]!!
                val target = call.request.queryParameters["target"]!!
                val result = sqlService.getSqlScript(current, target)
                call.respond(result)
            }
        }
    }

    //static resource
    routing {
        static("/") {
            resources("static/")
            file("css")
            file("js")
        }
    }
}

fun ApplicationCall.param(name: String): String? {
    return this.request.queryParameters[name]
}
