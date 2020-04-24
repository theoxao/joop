package com.theoxao.config

import com.mongodb.client.MongoDatabase
import io.ktor.application.Application
import io.ktor.application.ApplicationFeature
import io.ktor.util.AttributeKey
import io.ktor.util.KtorExperimentalAPI
import org.litote.kmongo.KMongo

/**
 * @author theo
 * @date 2020/4/24
 */


class Mongo(val mongoApplication: MongoApplication) {

    companion object Feature : ApplicationFeature<Application, MongoApplication, Mongo> {
        override fun install(
            pipeline: Application,
            configure: MongoApplication.() -> Unit
        ): Mongo {
            val application = MongoApplication().apply(configure)
            return Mongo(application)
        }

        override val key: AttributeKey<Mongo> = AttributeKey("Kmongo")
    }
}

class MongoApplication {

    lateinit var database: MongoDatabase

    inline fun <reified T : Any> getCollection(name: String) = database.getCollection(name)

    @KtorExperimentalAPI
    fun Application.kmongo(property: String = "database.mongo.uri") {
        database =
            KMongo.createClient(this.environment.config.property(property).getString()).getDatabase("database.mongo.db")
    }
}

