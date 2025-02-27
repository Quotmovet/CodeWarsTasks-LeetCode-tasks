package kyu6.kotlin.task2

// https://www.codewars.com/kata/51b6249c4612257ac0000005/train/kotlin
class Task2 {

    private val romanNumerals = mapOf(
        'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50,
        'C' to 100, 'D' to 500, 'M' to 1000,
    )

    // first try
    fun decode2(str: String): Int {

        var num = 0
        var preValue = 0

        for (char in str) {
            val value = romanNumerals[char] ?: 0
            num += if (value > preValue) value - 2 * preValue else value
            preValue = value
        }

        return num
    }

}
