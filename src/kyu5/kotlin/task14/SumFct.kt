package kyu5.kotlin.task14

import java.math.BigInteger

// https://www.codewars.com/kata/559a28007caad2ac4e000083/train/kotlin
object SumFct {

    fun perimeter(n: Int): BigInteger {
        return fibSum(n) * BigInteger.valueOf(4)
    }

    private fun fibSum(n: Int): BigInteger {
        var a = BigInteger.ONE
        var b = BigInteger.ONE
        var sum = a + b

        for (i in 2..n) {
            val next = a + b
            sum += next
            a = b
            b = next
        }
        return sum
    }
}
