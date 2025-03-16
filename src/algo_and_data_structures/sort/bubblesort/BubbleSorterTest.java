package algo_and_data_structures.sort.bubblesort;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import other.CompilationTimer;

public class BubbleSorterTest {

    // Компаратор для сортировки чисел
    private final Comparator<Integer> integerComparator = Comparator.naturalOrder();

    // Компаратор для сортировки строк
    private final Comparator<String> stringComparator = String.CASE_INSENSITIVE_ORDER;

    // Время компиляции
    List<String> filesToCompile = Arrays.asList(
            "src/algo_and_data_structures/sort/bubblesort/BubbleSorter.java",
            "src/algo_and_data_structures/sort/bubblesort/BubbleSorterTest.java"
    );
    long compilationTime = CompilationTimer.compileFiles(filesToCompile);

    @Test
    void testBubbleSortIntegersAscending() {
        BubbleSorter<Integer> sorter = new BubbleSorter<>(integerComparator);
        sorter.setAscending(true);

        List<Integer> input = Arrays.asList(64, 34, 25, 12, 22, 11, 90);
        List<Integer> expected = Arrays.asList(11, 12, 22, 25, 34, 64, 90);

        List<Integer> result = sorter.bubbleSort(input);
        System.out.println("Время компиляции: " + compilationTime + " наносекунд");
        assertEquals(expected, result, "Сортировка чисел по возрастанию работает некорректно");
    }

    @Test
    void testBubbleSortIntegersDescending() {
        BubbleSorter<Integer> sorter = new BubbleSorter<>(integerComparator);
        sorter.setAscending(false);

        List<Integer> input = Arrays.asList(64, 34, 25, 12, 22, 11, 90);
        List<Integer> expected = Arrays.asList(90, 64, 34, 25, 22, 12, 11);

        List<Integer> result = sorter.bubbleSort(input);
        assertEquals(expected, result, "Сортировка чисел по убыванию работает некорректно");
    }

    @Test
    void testBubbleSortStringsAscending() {
        BubbleSorter<String> sorter = new BubbleSorter<>(stringComparator);
        sorter.setAscending(true);

        List<String> input = Arrays.asList("banana", "apple", "cherry");
        List<String> expected = Arrays.asList("apple", "banana", "cherry");

        List<String> result = sorter.bubbleSort(input);
        assertEquals(expected, result, "Сортировка строк по возрастанию работает некорректно");
    }

    @Test
    void testBubbleSortStringsDescending() {
        BubbleSorter<String> sorter = new BubbleSorter<>(stringComparator);
        sorter.setAscending(false);

        List<String> input = Arrays.asList("banana", "apple", "cherry");
        List<String> expected = Arrays.asList("cherry", "banana", "apple");

        List<String> result = sorter.bubbleSort(input);
        assertEquals(expected, result, "Сортировка строк по убыванию работает некорректно");
    }

    @Test
    void testEmptyList() {
        BubbleSorter<Integer> sorter = new BubbleSorter<>(integerComparator);
        sorter.setAscending(true);

        List<Integer> input = List.of();
        List<Integer> expected = List.of();

        List<Integer> result = sorter.bubbleSort(input);
        assertEquals(expected, result, "Сортировка пустого списка работает некорректно");
    }

    @Test
    void testSingleElementList() {
        BubbleSorter<Integer> sorter = new BubbleSorter<>(integerComparator);
        sorter.setAscending(true);

        List<Integer> input = List.of(42);
        List<Integer> expected = List.of(42);

        List<Integer> result = sorter.bubbleSort(input);
        assertEquals(expected, result, "Сортировка списка с одним элементом работает некорректно");
    }

    @Test
    void testAlreadySortedList() {
        BubbleSorter<Integer> sorter = new BubbleSorter<>(integerComparator);
        sorter.setAscending(true);

        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> result = sorter.bubbleSort(input);
        assertEquals(expected, result, "Сортировка уже отсортированного списка работает некорректно");
    }
}
