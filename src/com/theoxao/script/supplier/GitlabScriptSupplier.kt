package cc.hibay.com.theoxao.script

import com.fasterxml.jackson.databind.ObjectMapper
import com.theoxao.model.gitlab.Commit
import com.theoxao.model.gitlab.TreeNode
import com.theoxao.script.supplier.ScriptSupplier
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.header
import io.ktor.client.request.parameter
import io.ktor.client.statement.HttpResponse
import io.ktor.client.statement.readBytes
import io.ktor.client.statement.request
import io.ktor.config.ApplicationConfig
import io.ktor.util.KtorExperimentalAPI
import org.slf4j.LoggerFactory
import java.net.URLEncoder

/**
 * @author theo
 * @date 2020/4/24
 */
@KtorExperimentalAPI
class GitlabScriptSupplier(private val httpClient: HttpClient, val config: ApplicationConfig) : ScriptSupplier {

    private val log = LoggerFactory.getLogger(this::class.java)

    private val baseUrl = config.property("gitlab.url").getString()
    private val repo = URLEncoder.encode(config.property("gitlab.repo").getString(), "UTF-8")
    private val repoUrl = "$baseUrl/projects/$repo"
    private val branch = config.property("gitlab.branch").getString().ifBlank { "master" }
    private val token = config.property("gitlab.token").getString()
    val basePath: String = config.property("basePath").getString()

    val objectMapper = ObjectMapper()


    /**
     * http://121.41.32.192:53001/api/v4/projects/70/repository/commits?ref=master&page=2&per_page=100
     */
    suspend fun fetchCommits(ref: String = branch, baseCommit: String): List<Commit> {
        val url = "$repoUrl/repository/commits"
        return getPagination<Commit>(url, mutableMapOf("ref" to ref)) {
            it.map { commit -> commit.id }
                .contains(baseCommit)
        }
    }

    /**
     * http://121.41.32.192:53001/api/v4/projects/70/repository/tree?path=mysql-base%2fsrc%2fmain%2fjava%2fcom%2fthigh%2fdb%2fdto&ref=master&recursive=true&per_page=100&page=1
     */
    suspend fun fetchFileTree(ref: String = branch, path: String = basePath): List<TreeNode> {
        val url = "$repoUrl/repository/tree"
        val params = mutableMapOf<String, Any?>(
            "path" to path,
            "ref" to ref,
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

    private suspend inline fun <reified T> get(url: String, params: MutableMap<String, Any?> = mutableMapOf()): T {
        log.info("request for {}", url)
        return httpClient.get(url) {
            this.header("PRIVATE-TOKEN", token)
            params.forEach { (key, value) ->
                this.parameter(key, value)
            }
        }
    }

    private suspend inline fun <reified T> getPagination(
        url: String,
        params: MutableMap<String, Any?> = mutableMapOf(),
        noinline haltWhen: ((List<T>) -> Boolean)? = null
    ): List<T> where T : Any {
        var hasNext = true
        var nextPage: Int? = 1
        val list = arrayListOf<List<T>>()
        do {
            params["page"] = nextPage
            params["per_page"] = 20
            val response = httpClient.get<HttpResponse>(url) {
                this.header("PRIVATE-TOKEN", token)
                params.forEach { (key, value) ->
                    this.parameter(key, value)
                }
            }
            log.info("request for {}", response.request.url)
//            val result  = response.receive<String>()
//            log.info("result {}" , result)
            val result = objectMapper.readValue<List<T>>(
                response.readBytes(),
                objectMapper.typeFactory.constructCollectionType(ArrayList::class.java, T::class.java)
            )
            list.add(result)
            nextPage = response.headers["X-Next-Page"]?.ifBlank { "-1" }?.toInt()
            hasNext = nextPage != -1
            if (haltWhen != null && haltWhen(result))
                hasNext = false
        } while (hasNext)
        return list.flatten()
    }
}

