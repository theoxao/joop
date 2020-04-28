package com.theoxao.ktor

import com.theoxao.service.SqlService
import io.ktor.application.Application
import io.ktor.application.call
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

    routing {
        route("/joop") {
            get("/sql_script") {
                val id = this.call.request.queryParameters["id"]!!
                assert(id.contains("-"))
                this.call.respond(sqlService.getSqlScript(id))
            }
        }
    }

}
