package codeWars.kyu4.kotlin.task24

import codeWars.kyu4.kotlin.task24.NextBiggerNumber.nextBiggerNumber
import org.junit.jupiter.api.Test
import org.testng.Assert.assertEquals

class KataTests {

    @Test
    fun basicTests() {
        assertEquals(21, nextBiggerNumber(12))
        assertEquals(531, nextBiggerNumber(513))
        assertEquals(2071, nextBiggerNumber(2017))
        assertEquals(441, nextBiggerNumber(414))
        assertEquals(414, nextBiggerNumber(144))
    }
}