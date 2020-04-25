package com.theoxao.common

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.DeserializationContext
import com.fasterxml.jackson.databind.JsonDeserializer
import org.joda.time.DateTime
import java.util.*

/**
 * @author theo
 * @date 2020/4/25
 */
class DateDeserializer : JsonDeserializer<Date>() {
    override fun deserialize(parser: JsonParser, ctx: DeserializationContext?): Date {
        val raw = parser.text
        return DateTime.parse(raw).toDate()
    }
}
