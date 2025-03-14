package codeWars.kyu5.kotlin.task4

// https://www.codewars.com/kata/55e7280b40e1c4a06d0000aa
class Task4 {

    fun chooseBestSum(t:Int, k:Int, ls:List<Int>):Int {

        val resulCombinations = combinations(ls, k)
        val bestValue = maxValueSublist(resulCombinations)

        println(bestValue.filter { it <= t }.max())

        return bestValue.filter { it <= t }.max()
    }

    // Функция комбинации значений
    private fun combinations(list: List<Int>, size: Int): List<List<Int>> {
        if (size > list.size) return emptyList()
        if (size == 0) return listOf(emptyList())

        return list.flatMapIndexed { index, element ->
            combinations(list.drop(index + 1), size - 1).map { listOf(element) + it }
        }
    }

    /*
    private fun maxValueSublist(list: List<List<Int>>): List<Int> {
        val maxValueList = mutableListOf<Int>()
        for (i in list.indices) {
            var temp = 0
            list[i].forEach { value -> temp += value }
            maxValueList.add(temp)
        }
        return maxValueList
    }
     */

    private fun maxValueSublist(list: List<List<Int>>): List<Int> {
        return list.map { it.sum() }
    }

}