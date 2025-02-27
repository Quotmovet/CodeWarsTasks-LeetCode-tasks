package kyu5.kotlin.task4

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class SumOfKTest {
    //----------------
    @Test
    fun BasicTests1() {
        println("****** Basic Tests small numbers******")
        var ts = listOf(50, 55, 56, 57, 58)
        val n = chooseBestSum(163, 3, ts)
        assertEquals(163, n.toLong())
        ts = listOf(50)
        val m = chooseBestSum(163, 3, ts)
        assertEquals(-1, m)

    }

    fun chooseBestSum(t: Int, k: Int, ls: List<Int>): Int {

        if (k > ls.size) return -1

        fun combinations(list: List<Int>, size: Int): List<List<Int>> {
            if (size == 0) return listOf(emptyList())
            if (size > list.size) return emptyList()
            return list.flatMapIndexed { index, element ->
                combinations(list.drop(index + 1), size - 1).map { listOf(element) + it }
            }
        }

        val bestValue = combinations(ls, k).map { it.sum() }

        return bestValue.filter { it <= t }.maxOrNull() ?: -1
    }

}