package kyu4.kotlin.task20

// https://www.codewars.com/kata/51ba717bb08c1cd60f00002f/train/kotlin
fun rangeExtraction(arr: IntArray): String {
    if (arr.isEmpty()) return ""

    val result = mutableListOf<String>()
    var start = arr[0]
    var prev = arr[0]

    for (i in 1..<arr.size) {
        if (arr[i] != prev + 1) {
            when (prev) {
                start -> result.add("$start")
                start + 1 -> result.add("$start,$prev")
                else -> result.add("$start-$prev")
            }
            start = arr[i]
        }
        prev = arr[i]
    }

    when (prev) {
        start -> result.add("$start")
        start + 1 -> result.add("$start,$prev")
        else -> result.add("$start-$prev")
    }

    return result.joinToString(",")
}
