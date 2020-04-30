package com.theoxao.ktor

import com.theoxao.service.CSVService
import com.theoxao.service.SqlService
import io.ktor.application.Application
import io.ktor.application.ApplicationCall
import io.ktor.application.call
import io.ktor.http.content.file
import io.ktor.http.content.files
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
    val csvService: CSVService by inject()

    routing {

        route("/git") {
            get("/commits") {
                val branch = this.call.param("branch")
                val list = csvService.getCommits(branch)
                this.call.respond(list)
            }
        }


        route("/joop") {
            get("/sql_script") {
                val id = this.call.request.queryParameters["id"]!!
                assert(id.contains("-"))
                this.call.respond(sqlService.getSqlScript(id))
            }
        }
        static("/static") {
            resources("static/")
        }
    }
}

fun ApplicationCall.param(name: String): String? {
    return this.request.queryParameters[name]
}
