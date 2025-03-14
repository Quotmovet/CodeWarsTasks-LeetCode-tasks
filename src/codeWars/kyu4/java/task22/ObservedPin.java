package codeWars.kyu4.java.task22;

import java.util.*;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5263c6999e0f40dee200059d/train/java
public class ObservedPin {

    public static List<String> getPINs(String observed) {
        List<int[]> sublists = formattedList(observed);
        List<String> result = new ArrayList<>();
        generateCombinations(sublists, 0, new StringBuilder(), result);
        return result;
    }

    private static List<int[]> formattedList(String observed) {
        return observed.chars()
                .mapToObj(c -> KEY_VALUE_MAP.get((char) c))
                .collect(Collectors.toList());
    }

    private static void generateCombinations(List<int[]> sets, int index, StringBuilder current, List<String> result) {
        if (index == sets.size()) {
            result.add(current.toString());
            return;
        }

        for (int num : sets.get(index)) {
            current.append(num);
            generateCombinations(sets, index + 1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }

    private static final Map<Character, int[]> KEY_VALUE_MAP = new HashMap<>();

    static {
        KEY_VALUE_MAP.put('0', new int[]{0, 8});
        KEY_VALUE_MAP.put('1', new int[]{1, 2, 4});
        KEY_VALUE_MAP.put('2', new int[]{1, 2, 3, 5});
        KEY_VALUE_MAP.put('3', new int[]{2, 3, 6});
        KEY_VALUE_MAP.put('4', new int[]{1, 4, 5, 7});
        KEY_VALUE_MAP.put('5', new int[]{2, 4, 5, 6, 8});
        KEY_VALUE_MAP.put('6', new int[]{3, 5, 6, 9});
        KEY_VALUE_MAP.put('7', new int[]{4, 7, 8});
        KEY_VALUE_MAP.put('8', new int[]{5, 7, 8, 9, 0});
        KEY_VALUE_MAP.put('9', new int[]{6, 8, 9});
    }
}
