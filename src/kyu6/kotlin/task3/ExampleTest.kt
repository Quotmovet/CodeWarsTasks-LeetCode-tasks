package kyu6.kotlin.task3

import org.testng.Assert.assertEquals
import org.testng.annotations.Test
import kotlin.math.*

class ExampleTest {

    @Test
    fun example() {
        assertEquals(4.63522, spiderToFly("H3", "E2"), 1e-3)
    }

    @Test
    fun same() {
        assertEquals(0.0, spiderToFly("C2", "C2"), 1e-3)
        assertEquals(0.0, spiderToFly("A0", "A0"), 1e-3)
        assertEquals(0.0, spiderToFly("F3", "F3"), 1e-3)
    }

    @Test
    fun `radial out`() {
        assertEquals(1.0, spiderToFly("H1", "H2"), 1e-3)
        assertEquals(3.0, spiderToFly("H1", "H4"), 1e-3)
    }

    @Test
    fun `radial thru the middle`() {
        assertEquals(8.0, spiderToFly("G4", "C4"), 1e-3)
        assertEquals(7.0, spiderToFly("G4", "C3"), 1e-3)
    }

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

    private fun spiderToFly(spider: String, fly: String): Double {

        val r1Value = spider[1].digitToInt()
        val r2Value = fly[1].digitToInt()

        val theta1 = degrees.getValue(spider[0])
        val theta2 = degrees.getValue(fly[0])

        val diff = abs(theta1 - theta2)
        val deltaTheta = Math.toRadians(min(diff, 360 - diff))

        // Формула Евклидова расстояния в полярных координатах
        return sqrt(
            r1Value.toDouble().pow(2) + r2Value.toDouble().pow(2) -
                    2 * r1Value * r2Value * cos(deltaTheta)
        )
    }
}