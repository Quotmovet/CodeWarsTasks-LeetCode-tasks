package codeWars.kyu4.java.task23;

import java.util.*;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/51e056fe544cf36c410000fb/
public class TopWords {

    static final int MAX_WORD_IN_LIST = 3;

    public static List<String> top3(String s) {
        if (s == null || s.isEmpty()) return Collections.emptyList();

        s = s.toLowerCase();

        String[] words = s.split("[^a-zA-Z']+");

        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            if (word.matches(".*[a-zA-Z].*")) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        return frequencyMap.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(MAX_WORD_IN_LIST)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
