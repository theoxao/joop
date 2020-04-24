package cc.hibay.com.theoxao.script

import com.theoxao.model.Commit
import com.theoxao.model.Diff
import com.theoxao.model.TreeNode
import com.theoxao.script.supplier.ScriptSupplier
import io.ktor.client.HttpClient
import io.ktor.client.call.receive
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.parameter
import io.ktor.client.statement.HttpResponse
import io.ktor.config.ApplicationConfig
import io.ktor.util.KtorExperimentalAPI
import java.net.URLEncoder

/**
 * @author theo
 * @date 2020/4/24
 */
@KtorExperimentalAPI
class GitlabScriptSupplier(private val httpClient: HttpClient, config: ApplicationConfig) : ScriptSupplier {

    private val baseUrl = config.property("gitlab.url").getString()
    private val repo = URLEncoder.encode(config.config("gitlab.repo").toString(), "UTF-8")
    private val repoUrl = "$baseUrl/projects/$repo"
    private val branch = config.property("gitlab.branch").getString().ifBlank { "master" }
    private val token = config.property("gitlab.token").getString()
    private val basePath = URLEncoder.encode(config.property("gitlab.joop.basePath").getString(), "UTF-8")

    /**
     * http://121.41.32.192:53001/api/v4/projects/70/repository/commits?ref=master&page=2&per_page=100
     */
    suspend fun fetchCommits(): List<Commit> {
        val url = "$repoUrl/repository/commits"
        return get<List<Commit>>(url)
    }

    /**
     * http://121.41.32.192:53001/api/v4/projects/70/repository/tree?path=mysql-base%2fsrc%2fmain%2fjava%2fcom%2fthigh%2fdb%2fdto&ref=master&recursive=true&per_page=100&page=1
     */
    suspend fun fetchFileTree(): List<TreeNode> {
        val url = "$repoUrl/repository/tree"
        val params = mutableMapOf<String, Any?>(
            "path" to basePath,
            "ref" to branch,
            "recursive" to true
        )
        return getPagination(url, params)
    }

    /**
     * http://121.41.32.192:53001/api/v4/projects/70/repository/blobs/c2c109058215eb64d14ab7f2b0f9e76a7a915314/raw
     */
    suspend fun fetchRawScript(blobId: String): String {
        val url = "$repoUrl/repository/blobs/$blobId/raw"
        return get(url)
    }

    /**
     * http://121.41.32.192:53001/api/v4/projects/70/repository/commits/f2531491e8baf881b0f312fe310a3ea9f1253a2d/diff?ref=master
     */
    suspend fun fetchDiff(commitId: String): List<Diff> {
        val url = "$repoUrl/repository/commits/$commitId/diff"
        return getPagination<Diff>(url, mutableMapOf("ref" to branch))
    }

    private suspend inline fun <reified T> get(url: String, params: MutableMap<String, Any?> = mutableMapOf()): T {
        return httpClient.get(url) {
            this.header("PRIVATE-TOKEN", token)
            params.forEach { (key, value) ->
                this.parameter(key, value)
            }
        }
    }

    private suspend inline fun <reified T> getPagination(
        url: String,
        params: MutableMap<String, Any?> = mutableMapOf()
    ): List<T> {
        var hasNext = true
        var nextPage: Int? = 1
        val list = arrayListOf<List<T>>()
        do {
            params["page"] = nextPage
            params["per_page"] = 100
            val response = httpClient.get<HttpResponse>(url) {
                this.header("PRIVATE-TOKEN", token)
                params.forEach { (key, value) ->
                    this.parameter(key, value)
                }
            }
            list.add(response.receive())
            nextPage = response.headers["X-Next-Page"]?.ifBlank { "-1" }?.toInt()
            hasNext = nextPage != -1
        } while (hasNext)
        return list.flatten()
    }
}

