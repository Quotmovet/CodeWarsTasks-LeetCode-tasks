package algo_and_data_structures.stack_and_queues.stack;

import java.util.List;

public interface StackAPI<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
}
