package kyu5.java.task18;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

class SolutionTest {

    @Test
    void testRot13() {
        assertEquals("grfg", "Input: \"test\"", Kata.rot13("test"));
        assertEquals("Grfg", "Input: \"Test\"", Kata.rot13("Test"));
    }
}