package kyu5.kotlin.task10

// https://www.codewars.com/kata/550f22f4d758534c1100025a/train/kotlin
object DirReduction {
    fun dirReduc(arr: Array<String>): Array<String> {

        val cardinalDirections = mapOf(
            "NORTH" to "SOUTH",
            "SOUTH" to "NORTH",
            "EAST" to "WEST",
            "WEST" to "EAST"
        )
        val stack = mutableListOf<String>()

        for (direction in arr) {
            if (stack.isNotEmpty() && stack.last() == cardinalDirections[direction]) {
                stack.removeAt(stack.size - 1)
            } else {
                stack.add(direction)
            }
        }

        return stack.toTypedArray()
    }
}