package task9;

import java.util.Map;

// https://www.codewars.com/kata/54b724efac3d5402db00065e/train/java
public class MorseCodeDecoder {
    public static String decode(String morseCode) {

        StringBuilder result = new StringBuilder();
        String[] words = morseCode.trim().split("\\s{3}");

        for (String word : words) {
            String[] symbols = word.split("\\s");
            for (String letter : symbols) {
                result.append(MORSE_MAP.getOrDefault(letter, " "));
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

    private static final Map<String, String> MORSE_MAP = Map.ofEntries(
            Map.entry(".-", "A"),    Map.entry("-...", "B"),  Map.entry("-.-.", "C"), Map.entry("-..", "D"),
            Map.entry(".", "E"),     Map.entry("..-.", "F"),  Map.entry("--.", "G"),  Map.entry("....", "H"),
            Map.entry("..", "I"),    Map.entry(".---", "J"),  Map.entry("-.-", "K"),  Map.entry(".-..", "L"),
            Map.entry("--", "M"),    Map.entry("-.", "N"),    Map.entry("---", "O"),  Map.entry(".--.", "P"),
            Map.entry("--.-", "Q"),  Map.entry(".-.", "R"),   Map.entry("...", "S"),  Map.entry("-", "T"),
            Map.entry("..-", "U"),   Map.entry("...-", "V"),  Map.entry(".--", "W"),  Map.entry("-..-", "X"),
            Map.entry("-.--", "Y"),  Map.entry("--..", "Z"),  Map.entry("-----", "0"), Map.entry(".----", "1"),
            Map.entry("..---", "2"), Map.entry("...--", "3"), Map.entry("....-", "4"), Map.entry(".....", "5"),
            Map.entry("-....", "6"), Map.entry("--...", "7"), Map.entry("---..", "8"), Map.entry("----.", "9"),
            Map.entry("-.-.--", "!"), Map.entry("...---...", "SOS"), Map.entry(".-.-.-", ".")
    );
}
