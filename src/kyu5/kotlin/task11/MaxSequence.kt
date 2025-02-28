package kyu5.kotlin.task11

// https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c/train/kotlin
fun maxSequence(arr: List<Int>): Int {

    var maxSum = 0
    var currentSum = 0

    for (num in arr) {
        currentSum = maxOf(0, currentSum + num)
        maxSum = maxOf(maxSum, currentSum)
    }

    return maxSum
}