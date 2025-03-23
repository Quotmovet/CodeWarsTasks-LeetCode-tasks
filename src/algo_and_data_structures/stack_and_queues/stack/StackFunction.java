package algo_and_data_structures.stack_and_queues.stack;

import java.util.ArrayList;
import java.util.List;

public class StackFunction<T> implements StackAPI<T> {

    private final List<T> stack;

    public StackFunction(int capacity){
        this.stack = new ArrayList<>(capacity);
    }

    @Override
    public void push(T item) {
        stack.add(item);
    }

    @Override
    public T pop() {
        if(stack.isEmpty()) throw new IllegalStateException("Stack is empty");
        return stack.removeLast();
    }

    @Override
    public T peek() {
        if(stack.isEmpty()) throw new IllegalStateException("Stack is empty");
        return stack.getLast();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
