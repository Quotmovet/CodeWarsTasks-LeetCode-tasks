package task1

import kotlin.random.Random

// https://www.codewars.com/kata/534d2f5b5371ecf8d2000a08
class Task1 {

    fun firstVariant () {
        val generalList = mutableListOf<List<Int>>()

        while(generalList.size < MAX_VALUES_IN_LIST) {
            val tempList = mutableListOf<Int>()

            while (tempList.size < MAX_VALUES_IN_LIST) {
                tempList.add(Random.nextInt(0, MAX_VALUES_OF_NUM))
            }
            generalList.add(tempList.toList())
        }
        println("Массив: \n" + generalList.joinToString() + "\n")
        matrixArray(generalList)
    }

    fun secondVariant () {
        val generalList = List(MAX_VALUES_IN_LIST) {
            List(MAX_VALUES_IN_LIST) {
                Random.nextInt(0, MAX_VALUES_IN_LIST)
            }
        }

        println("Массив: \n" + generalList.joinToString() + "\n")

        matrixArray(generalList)
    }

    private fun matrixArray(matrix: List<List<Int>>) {
        println("Массив в виде матрицы:")
        matrix.forEach { println(it.joinToString()) }
    }

    companion object {
        const val MAX_VALUES_IN_LIST = 3
        const val MAX_VALUES_OF_NUM = 9
    }
}