package algo_and_data_structures.sort.select_and_insert_sort;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import other.CompilationTimer;

public class SelectAndInsertSorterTest {

    private final Comparator<Integer> integerComparator = Comparator.naturalOrder();
    private final Comparator<String> stringComparator = String.CASE_INSENSITIVE_ORDER;

    // Время компиляции
    List<String> filesToCompile = Arrays.asList(
            "src/algo_and_data_structures/sort/select_and_insert_sort/SelectAndSelectAndInsertSorter.java",
            "src/algo_and_data_structures/sort/select_and_insert_sort/SelectAndInsertSorterTest.java"
    );
    long compilationTime = CompilationTimer.compileFiles(filesToCompile);

    @Test
    void testSelectAndInsertSortIntegersAscending() {
        SelectAndSelectAndInsertSorter<Integer> sorter = new SelectAndSelectAndInsertSorter<>(integerComparator);
        sorter.setAscending(true);

        List<Integer> input = Arrays.asList(64, 34, 25, 12, 22, 11, 90);
        List<Integer> expected = Arrays.asList(11, 12, 22, 25, 34, 64, 90);

        List<Integer> result1 = sorter.selectSort(input);
        List<Integer> result2 = sorter.insertSort(input);
        System.out.println("Время компиляции: " + compilationTime + " наносекунд");
        assertEquals(expected, result1, "Сортировка чисел по возрастанию работает некорректно");
        assertEquals(expected, result2, "Сортировка чисел по возрастанию работает некорректно");

    }

    @Test
    void testSelectAndInsertSortIntegersDescending() {
        SelectAndSelectAndInsertSorter<Integer> sorter = new SelectAndSelectAndInsertSorter<>(integerComparator);
        sorter.setAscending(false);

        List<Integer> input = Arrays.asList(64, 34, 25, 12, 22, 11, 90);
        List<Integer> expected = Arrays.asList(90, 64, 34, 25, 22, 12, 11);

        List<Integer> result1 = sorter.selectSort(input);
        List<Integer> result2 = sorter.insertSort(input);
        assertEquals(expected, result1, "Сортировка чисел по убыванию работает некорректно");
        assertEquals(expected, result2, "Сортировка чисел по убыванию работает некорректно");
    }

    @Test
    void testSelectAndInsertSortStringsAscending() {
        SelectAndSelectAndInsertSorter<String> sorter = new SelectAndSelectAndInsertSorter<>(stringComparator);
        sorter.setAscending(true);

        List<String> input = Arrays.asList("banana", "apple", "cherry");
        List<String> expected = Arrays.asList("apple", "banana", "cherry");

        List<String> result1 = sorter.selectSort(input);
        List<String> result2 = sorter.insertSort(input);
        assertEquals(expected, result1, "Сортировка строк по возрастанию работает некорректно");
        assertEquals(expected, result2, "Сортировка строк по возрастанию работает некорректно");
    }

    @Test
    void testSelectAndInsertSortStringsDescending() {
        SelectAndSelectAndInsertSorter<String> sorter = new SelectAndSelectAndInsertSorter<>(stringComparator);
        sorter.setAscending(false);

        List<String> input = Arrays.asList("banana", "apple", "cherry");
        List<String> expected = Arrays.asList("cherry", "banana", "apple");

        List<String> result1 = sorter.selectSort(input);
        List<String> result2 = sorter.selectSort(input);
        assertEquals(expected, result1, "Сортировка строк по убыванию работает некорректно");
        assertEquals(expected, result2, "Сортировка строк по убыванию работает некорректно");
    }

    @Test
    void testEmptyList() {
        SelectAndSelectAndInsertSorter<Integer> sorter = new SelectAndSelectAndInsertSorter<>(integerComparator);
        sorter.setAscending(true);

        List<Integer> input = List.of();
        List<Integer> expected = List.of();

        List<Integer> result1 = sorter.selectSort(input);
        List<Integer> result2 = sorter.insertSort(input);
        assertEquals(expected, result1, "Сортировка пустого списка работает некорректно");
        assertEquals(expected, result2, "Сортировка пустого списка работает некорректно");
    }

    @Test
    void testSingleElementList() {
        SelectAndSelectAndInsertSorter<Integer> sorter = new SelectAndSelectAndInsertSorter<>(integerComparator);
        sorter.setAscending(true);

        List<Integer> input = List.of(42);
        List<Integer> expected = List.of(42);

        List<Integer> result1 = sorter.selectSort(input);
        List<Integer> result2 = sorter.insertSort(input);
        assertEquals(expected, result1, "Сортировка списка с одним элементом работает некорректно");
        assertEquals(expected, result2, "Сортировка списка с одним элементом работает некорректно");
    }

    @Test
    void testAlreadySortedList() {
        SelectAndSelectAndInsertSorter<Integer> sorter = new SelectAndSelectAndInsertSorter<>(integerComparator);
        sorter.setAscending(true);

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result1 = sorter.selectSort(input);
        List<Integer> result2 = sorter.insertSort(input);
        assertEquals(expected, result1, "Сортировка уже отсортированного списка работает некорректно");
        assertEquals(expected, result2, "Сортировка уже отсортированного списка работает некорректно");
    }
}
