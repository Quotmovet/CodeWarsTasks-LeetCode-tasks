package codeWars.kyu4.kotlin.task25

import kotlin.math.abs

fun sumOfDivided(l: IntArray): String {
    if (l.isEmpty()) return ""

    val primeDivisors = mutableSetOf<Int>()

    l.forEach { number ->
        val n = abs(number)
        for (i in 2..n) {
            if (n % i == 0 && isPrime(i)) {
                primeDivisors.add(i)
            }
        }
    }

    val sortedDivisors = primeDivisors.sorted()

    val result = sortedDivisors.joinToString("") { divisor ->
        val sum = l.filter { abs(it) % divisor == 0 }.sum()
        "($divisor $sum)"
    }

    return result
}

private fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    if (n <= 3) return true
    if (n % 2 == 0 || n % 3 == 0) return false

    var i = 5
    while (i * i <= n) {
        if (n % i == 0 || n % (i + 2) == 0) return false
        i += 6
    }
    return true
}
