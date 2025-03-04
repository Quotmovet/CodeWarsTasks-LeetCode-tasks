package kyu5.kotlin.task15

// https://www.codewars.com/kata/54d512e62a5e54c96200019e/train/kotlin
object PrimeDecomp {
    fun factors(l: Int): String {
        if (l < 1) return "Incorrect number"

        val mapPair = mutableMapOf<Int, Int>()
        var currentValue = l
        var divisor = 2

        while(currentValue > 1) {
            var timer = 0
            while (currentValue % divisor == 0) {
                currentValue /= divisor
                timer++
            }
            if (timer > 0) {
                mapPair[divisor] = timer
            }
            divisor++
        }

        return mapPair.entries.joinToString("") { (base, exponent) ->
            if (exponent == 1) "($base)" else "($base**$exponent)"
        }
    }
}