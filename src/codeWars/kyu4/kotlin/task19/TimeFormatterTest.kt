package codeWars.kyu4.kotlin.task19

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class TimeFormatterTest {
    @Test
    fun testFormatDurationExamples() {
        // Example Test Cases
        assertEquals("1 second", TimeFormatter.formatDuration(1))
        assertEquals("1 minute and 2 seconds", TimeFormatter.formatDuration(62))
        assertEquals("2 minutes", TimeFormatter.formatDuration(120))
        assertEquals("1 hour", TimeFormatter.formatDuration(3600))
        assertEquals("1 hour, 1 minute and 2 seconds", TimeFormatter.formatDuration(3662))
    }
}