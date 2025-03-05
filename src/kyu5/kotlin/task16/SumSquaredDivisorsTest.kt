package kyu5.kotlin.task16

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class SumSquaredDivisorsTest {

    @Test
    fun basicTests() {
        assertEquals("[[1, 1], [42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(1, 250))
        assertEquals("[[42, 2500], [246, 84100]]", SumSquaredDivisors.listSquared(42, 250))

    }
}