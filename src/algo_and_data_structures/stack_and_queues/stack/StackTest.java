package algo_and_data_structures.stack_and_queues.stack;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.testng.annotations.Test;

import java.util.List;

public class StackTest {

    @Test
    void testPushAndPeekOnInteger() {
        StackFunction<Integer> stack = new StackFunction<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, (int) stack.peek());
    }

    @Test
    void testPopOnInteger() {
        StackFunction<Integer> stack = new StackFunction<>(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(3, (int) stack.pop());
        assertEquals(2, (int) stack.pop());
    }

    @Test
    void testPushAndPeekOnString() {
        StackFunction<String> stack = new StackFunction<>(5);
        stack.push("Hello");
        stack.push("World");
        stack.push("!");
        assertEquals("!", stack.peek());
    }

    @Test
    void testPopOnString() {
        StackFunction<String> stack = new StackFunction<>(5);
        stack.push("Hello");
        stack.push("World");
        stack.push("!");
        assertEquals("!", stack.pop());
        assertEquals("World", stack.pop());
    }

    @Test
    void testEmptyStack() {
        StackFunction<Integer> stack = new StackFunction<>(5);
        assertTrue(stack.isEmpty());
    }
}
