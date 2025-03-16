package algo_and_data_structures.sort.bubblesort;

import java.util.Comparator;
import java.util.List;

public class BubbleSorter<T> implements BubbleSorterAPI<T> {

    private final Comparator<T> comparator;
    private boolean ascending = true;

    // Конструктор с компаратором
    public BubbleSorter(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    // Метод для установки направления сортировки
    public void setAscending(boolean ascending) {
        this.ascending = ascending;
    }

    // Метод для получения направления сортировки
    public boolean isAscending() {
        return ascending;
    }

    @Override
    public List<T> bubbleSort(List<T> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int compareResult = comparator.compare(list.get(j), list.get(j + 1));
                if ((ascending && compareResult > 0) || (!ascending && compareResult < 0)) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }
}
