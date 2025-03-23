package algo_and_data_structures.stack_and_queues.queues;

import java.util.ArrayList;
import java.util.List;

public class QueuesFunction<T> implements QueuesAPI<T> {

    private final List<T> queue;

    public QueuesFunction(int capacity) {
        this.queue = new ArrayList<>(capacity);
    }

    @Override
    public void insert(T item) {
        queue.add(item);
    }

    @Override
    public T remove() {
        if (queue.isEmpty()) { throw new IllegalStateException("Queue is empty"); }
        return queue.removeFirst();
    }

    @Override
    public T peek() {
        if (queue.isEmpty()) { throw new IllegalStateException("Queue is empty"); }
        return queue.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
