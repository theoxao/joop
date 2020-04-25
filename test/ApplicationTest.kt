package cc.hibay

import com.theoxao.main
import groovy.lang.GroovyShell
import io.ktor.http.*
import kotlin.test.*
import io.ktor.server.testing.*
import io.ktor.util.KtorExperimentalAPI
import org.joda.time.DateTime
import java.io.File
import java.io.FileInputStream
import java.nio.charset.Charset

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
        val raw = FileInputStream(File("/home/theo/workspace/mzf/joop/test/Mask")).readBytes()
            .toString(Charset.defaultCharset())
        val script = GroovyShell().parse(raw)
        println("halt")
    }

}
