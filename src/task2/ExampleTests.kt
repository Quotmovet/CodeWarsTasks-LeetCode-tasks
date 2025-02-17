package task2

import org.testng.Assert.assertEquals
import org.testng.annotations.Test
import java.lang.Integer.decode

class ExampleTests {

    @Test
    fun basic() {
        assertEquals(0, decode(""))
        assertEquals(1, decode("I"))
        assertEquals(21, decode("XXI"))
        assertEquals(2008, decode("MMVIII"))
        assertEquals(1666, decode("MDCLXVI"))
    }
}