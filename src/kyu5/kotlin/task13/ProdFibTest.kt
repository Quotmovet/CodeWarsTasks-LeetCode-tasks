package kyu5.kotlin.task13

import org.testng.annotations.Test
import org.testng.internal.junit.ArrayAsserts.assertArrayEquals

class ProdFibTest {

    @Test
    fun test1() {
        val r = longArrayOf(55, 89, 1)
        assertArrayEquals(r, productFib(4895))
    }

    @Test
    fun test2() {
        val r = longArrayOf(89, 144, 0)
        assertArrayEquals(r, productFib(5895))
    }

}