package kyu5.kotlin.task11

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class ExampleTestCases {

    @Test
    fun `it should work on an empty list`() {
        assertEquals(0, maxSequence(emptyList()))
    }

    @Test
    fun `it should work on the example`() {
        assertEquals(6, maxSequence(listOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
    }

}
