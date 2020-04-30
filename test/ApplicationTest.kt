package cc.hibay

import com.theoxao.antlr.KeyWalker
import com.theoxao.antlr.preParse
import com.theoxao.main
import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withTestApplication
import io.ktor.util.KtorExperimentalAPI
import org.joda.time.DateTime
import java.io.File
import java.io.FileInputStream
import java.nio.charset.Charset
import kotlin.test.Test
import kotlin.test.assertEquals

@KtorExperimentalAPI
class ApplicationTest {
    @Test
    fun testRoot() {
        withTestApplication({ main() }) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("HELLO WORLD!", response.content)
            }
        }
    }

    @Test
    fun testInjection() {
        println(DateTime.parse("2020-04-25T12:13:57.000+08:00").toDate())
    }

    @Test
    fun testGroovyParser() {
        val raw = FileInputStream(File("/home/theo/workspace/mzf/joop/test/Keys")).readBytes()
            .toString(Charset.defaultCharset())
        preParse(raw, {
            KeyWalker("123")
        }, {

        })
    }

}
