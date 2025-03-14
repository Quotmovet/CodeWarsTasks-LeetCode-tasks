package codeWars.kyu5.kotlin.task17

// https://www.codewars.com/kata/55c6126177c9441a570000cc/train/kotlin
fun orderWeight(string:String) = string.split(" ").sortedWith(compareBy({ it.sumOf { ch -> ch.digitToInt() } }, { it })).joinToString(" ")