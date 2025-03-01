package kyu5.kotlin.task12

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class ScorerFunctionTest {

    @Test
    fun shouldValueThisAsWorthless() {
        assertEquals(0, score(intArrayOf(2, 3, 4, 6, 2)), "Incorrect answer for dice = [2, 3, 4, 6, 2]")
    }

    @Test
    fun shouldValueThisTripletCorrectly() {
        assertEquals(400, score(intArrayOf(4, 4, 4, 3, 3)), "Incorrect answer for dice = [4, 4, 4, 3, 3]")
    }

    @Test
    fun shouldValueThisMixedSetCorrectly() {
        assertEquals(450, score(intArrayOf(2, 4, 4, 5, 4)), "Incorrect answer for dice = [2, 4, 4, 5, 4]")
    }
}