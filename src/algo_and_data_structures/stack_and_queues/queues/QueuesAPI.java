package algo_and_data_structures.stack_and_queues.queues;

public interface QueuesAPI<T> {
    void insert(T item);
    T remove();
    T peek();
    boolean isEmpty();
}
