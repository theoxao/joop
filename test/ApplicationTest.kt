package cc.hibay

import com.theoxao.antlr.KeyWalker
import com.theoxao.antlr.TableWalker
import com.theoxao.antlr.preParse
import com.theoxao.main
import io.ktor.http.HttpMethod
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.handleRequest
import io.ktor.server.testing.withTestApplication
import io.ktor.util.KtorExperimentalAPI
import org.intellij.lang.annotations.Language
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
//        val raw = FileInputStream(File("/home/theo/workspace/mzf/joop/test/Keys")).readBytes()
//            .toString(Charset.defaultCharset())
        preParse(raw) {
            KeyWalker(it)
        }
    }

    @Language("JAVA")
    val raw =
        "public class Keys {\n\n    public static final UniqueKey<FkRecord> KEY_FK_PRIMARY = UniqueKeys0.KEY_FK_PRIMARY;\n    public static final UniqueKey<IdetityExampleRecord> KEY_IDETITY_EXAMPLE_PRIMARY = UniqueKeys0.KEY_IDETITY_EXAMPLE_PRIMARY;\n    public static final UniqueKey<TableExampleRecord> KEY_TABLE_EXAMPLE_PRIMARY = UniqueKeys0.KEY_TABLE_EXAMPLE_PRIMARY;\n    public static final UniqueKey<TableExampleRecord> KEY_TABLE_EXAMPLE_IX_UNIQUE_INDEX = UniqueKeys0.KEY_TABLE_EXAMPLE_IX_UNIQUE_INDEX;\n\n    public static final ForeignKey<TableExampleRecord, FkRecord> FK_REFERENCE_KEY = ForeignKeys0.FK_REFERENCE_KEY;\n\n    private static class UniqueKeys0 extends AbstractKeys {\n        public static final UniqueKey<FkRecord> KEY_FK_PRIMARY = createUniqueKey(Fk.FK, \"KEY_fk_PRIMARY\", Fk.FK.FK_);\n        public static final UniqueKey<IdetityExampleRecord> KEY_IDETITY_EXAMPLE_PRIMARY = createUniqueKey(IdetityExample.IDETITY_EXAMPLE, \"KEY_idetity_example_PRIMARY\", IdetityExample.IDETITY_EXAMPLE.ID);\n        public static final UniqueKey<TableExampleRecord> KEY_TABLE_EXAMPLE_PRIMARY = createUniqueKey(TableExample.TABLE_EXAMPLE, \"KEY_table_example_PRIMARY\", TableExample.TABLE_EXAMPLE.FIRST_KEY, TableExample.TABLE_EXAMPLE.FEAT_SECOND_KEY);\n        public static final UniqueKey<TableExampleRecord> KEY_TABLE_EXAMPLE_IX_UNIQUE_INDEX = createUniqueKey(TableExample.TABLE_EXAMPLE, \"KEY_table_example_ix_unique_index\", TableExample.TABLE_EXAMPLE.FEAT_UNIQUE_INDEX);\n    }\n\n    private static class ForeignKeys0 extends AbstractKeys {\n        public static final ForeignKey<TableExampleRecord, FkRecord> FK_REFERENCE_KEY = createForeignKey(com.thigh.db.dto.joop.Keys.KEY_FK_PRIMARY, TableExample.TABLE_EXAMPLE, \"fk_reference_key\", TableExample.TABLE_EXAMPLE.FEAT_REFERENCE_KEY);\n    }\n}\n"

}
