package kyu5.kotlin.task14

import org.testng.Assert.assertEquals
import org.testng.annotations.Test
import java.math.BigInteger

class  SumFctTest {

    @Test
    fun basicTests() {
        assertEquals(BigInteger.valueOf(80), SumFct.perimeter(5))
        assertEquals(BigInteger.valueOf(216), SumFct.perimeter(7))
        assertEquals(BigInteger.valueOf(14098308), SumFct.perimeter(30))
    }
}