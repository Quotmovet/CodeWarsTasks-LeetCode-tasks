package codeWars.kyu5.kotlin.task16

import kotlin.math.sqrt

object SumSquaredDivisors {

    fun listSquared(m: Long, n: Long): String {
        val result = mutableListOf<List<Long>>()

        for (x in m..n) {
            val sumOfSquares = sumOfSquaredDivisors(x)
            val sqrtSum = sqrt(sumOfSquares.toDouble()).toLong()

            if (sqrtSum * sqrtSum == sumOfSquares) {
                result.add(listOf(x, sumOfSquares))
            }
        }

        return result.toString()
    }

    private fun sumOfSquaredDivisors(num: Long): Long {
        var sum = 0L
        for (i in 1..num) {
            if (i * i > num) break
            if (num % i == 0L) {
                sum += i * i
                val pair = num / i
                if (i != pair) {
                    sum += pair * pair
                }
            }
        }
        return sum
    }
}

