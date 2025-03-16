package algo_and_data_structures.sort.select_and_insert_sort;

import java.util.Comparator;
import java.util.List;

public class SelectAndSelectAndInsertSorter<T> implements SelectAndInsertSorterAPI<T> {

    private final Comparator<T> comparator;
    private boolean ascending = true;

    public SelectAndSelectAndInsertSorter(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public void setAscending(boolean ascending) {
        this.ascending = ascending;
    }

    public boolean getAscending() {
        return ascending;
    }

    public List<T> selectSort(List<T> list) {
        int n = list.size();
        int out, in, min;

        for(out = 0; out < n - 1; out++) {
            min = out;
            for (in = out + 1; in < n; in++) {
                int compareResult = comparator.compare(list.get(min), list.get(in));
                if ((ascending && compareResult > 0) || (!ascending && compareResult < 0)) {
                    min = in;
                }
            }
            if (min != out) {
                T temp = list.get(out);
                list.set(out, list.get(min));
                list.set(min, temp);
            }
        }

        return list;
    }

    public List<T> insertSort(List<T> list) {
        for(int out = 1; out < list.size(); out++){
            T current = list.get(out);
            int in = out - 1;
            int compareResult = comparator.compare(list.get(in), current);
            while(in >= 0 && (ascending && compareResult > 0) || (!ascending && compareResult < 0)) {
                list.set(in + 1, list.get(in));
                in--;
            }
            list.set(in + 1, current);
        }

        return list;
    }
}
