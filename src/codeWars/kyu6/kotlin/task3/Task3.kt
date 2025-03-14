package codeWars.kyu6.kotlin.task3

import kotlin.math.*

// https://www.codewars.com/kata/5a30e7e9c5e28454790000c1/train/kotlin
class Task3 {

    private val degrees = mapOf(
        'A' to 0.0,
        'B' to 45.0,
        'C' to 90.0,
        'D' to 135.0,
        'E' to 180.0,
        'F' to 225.0,
        'G' to 270.0,
        'H' to 315.0,
    )

    fun spiderToFly(spider: String, fly: String): Double {

        val r1Value = spider[1].digitToInt()
        val r2Value = fly[1].digitToInt()

        val diff = abs(degrees.getValue(spider[0]) - degrees.getValue(fly[0]))
        val deltaTheta = Math.toRadians(min(diff, 360 - diff))

        // Формула Евклидова расстояния в полярных координатах
        return sqrt(r1Value.toDouble().pow(2) + r2Value.toDouble().pow(2) - 2 * r1Value * r2Value * cos(deltaTheta))
    }
}