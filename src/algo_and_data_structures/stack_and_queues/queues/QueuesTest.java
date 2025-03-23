package algo_and_data_structures.stack_and_queues.queues;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import org.testng.annotations.Test;

public class QueuesTest {

    @Test
    void testEnqueueAndPeekOnInteger() {
        QueuesFunction<Integer> queue = new QueuesFunction<>(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        assertEquals(1, (int) queue.peek());
    }

    @Test
    void testDequeueOnInteger() {
        QueuesFunction<Integer> queue = new QueuesFunction<>(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        assertEquals(1, (int) queue.remove());
        assertEquals(2, (int) queue.remove());
    }

    @Test
    void testEnqueueAndPeekOnString() {
        QueuesFunction<String> queue = new QueuesFunction<>(5);
        queue.insert("Hello");
        queue.insert("World");
        queue.insert("!");
        assertEquals("Hello", queue.peek());
    }

    @Test
    void testDequeueOnString() {
        QueuesFunction<String> queue = new QueuesFunction<>(5);
        queue.insert("Hello");
        queue.insert("World");
        queue.insert("!");
        assertEquals("Hello", queue.remove());
        assertEquals("World", queue.remove());
    }

    @Test
    void testEmptyQueue() {
        QueuesFunction<Integer> queue = new QueuesFunction<>(5);
        assertTrue(queue.isEmpty());
    }
}
