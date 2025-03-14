package codeWars.kyu4.kotlin.task24

// https://www.codewars.com/kata/55983863da40caa2c900004e/train/kotlin
object NextBiggerNumber {

    fun nextBiggerNumber(n: Long): Long {
        val digits = n.toString().toMutableList()

        var pivot = -1
        for (i in digits.size - 2 downTo 0) {
            if (digits[i] < digits[i + 1]) {
                pivot = i
                break
            }
        }

        if (pivot == -1) return -1

        var swap = -1
        for (i in digits.size - 1 downTo pivot + 1) {
            if (digits[i] > digits[pivot]) {
                swap = i
                break
            }
        }

        digits[pivot] = digits[swap].also { digits[swap] = digits[pivot] }

        digits.subList(pivot + 1, digits.size).sort()

        return digits.joinToString("").toLong()
    }
}