package codeWars.kyu5.java.task6;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static org.testng.AssertJUnit.assertEquals;

public class SolutionTest {
    @Test
    public void simple_1() {
        String[] program = new String[]{"mov a 5","inc a","dec a","dec a","jnz a -1","inc a"};
        Map<String, Integer> out = new HashMap<>();
        out.put("a", 1);
        assertEquals(out, SimpleAssembler.interpret(program));
    }

    @Test
    public void simple_2() {
        String[] program = new String[]{"mov a -10","mov b a","inc a","dec b","jnz a -2"};
        Map<String, Integer> out = new HashMap<>();
        out.put("a", 0);
        out.put("b", -20);
        assertEquals(out, SimpleAssembler.interpret(program));
    }
}
