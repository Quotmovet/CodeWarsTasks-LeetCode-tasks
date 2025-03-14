package codeWars.kyu5.kotlin.task13

// https://www.codewars.com/kata/5541f58a944b85ce6d00006a/train/kotlin
fun productFib(prod:Long):LongArray {

    var a = 0L
    var b = 1L

    while (a * b < prod) {
        val next = a + b
        a = b
        b = next
    }

    return longArrayOf(a, b, if (a * b == prod) 1 else 0)
}