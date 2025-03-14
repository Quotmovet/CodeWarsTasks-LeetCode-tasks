package codeWars.kyu5.kotlin.task12

// https://www.codewars.com/kata/5270d0d18625160ada0000e4/train/kotlin
fun score(dice: IntArray): Int {

    var score = 0
    val tempMap = mutableMapOf<Int, MutableList<Int>>()

    for (d in dice) {
        tempMap.putIfAbsent(d, mutableListOf())
        tempMap[d]?.add(d)
    }

    for ((key, value) in massive) {
        while (key.all { it in tempMap && tempMap[it]!!.size >= key.count { num -> num == it } }) {
            score += value
            key.forEach { tempMap[it]?.removeAt(0) }
        }
    }

    return score
}

val massive = mapOf(
    listOf(1, 1, 1) to 1000,
    listOf(6, 6, 6) to 600,
    listOf(5, 5, 5) to 500,
    listOf(4, 4, 4) to 400,
    listOf(3, 3, 3) to 300,
    listOf(2, 2, 2) to 200,
    listOf(1) to 100,
    listOf(5) to 50,
)
