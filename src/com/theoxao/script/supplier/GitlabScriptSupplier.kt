package cc.hibay.com.theoxao.script

import io.ktor.client.HttpClient
import io.ktor.config.ApplicationConfig
import io.ktor.util.KtorExperimentalAPI
import java.net.URLEncoder

/**
 * @author theo
 * @date 2020/4/24
 */
@KtorExperimentalAPI
class GitlabScriptSupplier(private val httpClient: HttpClient, config: ApplicationConfig) {

    private val baseUrl = config.property("gitlab.url").getString()
    private val repo = config.property("gitlab.repo").getString()
    private val branch = config.property("gitlab.branch").getString().ifBlank { "master" }
    private val token = config.property("gitlab.token")

    fun fetchCommits() {
        val url = "$baseUrl/projects/${URLEncoder.encode(repo, "UTF-8")}/repository/commits"
    }

}


fun HttpClient.fetch(url: String) {

}
