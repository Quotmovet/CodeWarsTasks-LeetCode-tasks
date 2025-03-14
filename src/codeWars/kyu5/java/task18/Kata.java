package codeWars.kyu5.java.task18;

// https://www.codewars.com/kata/530e15517bc88ac656000716/
public class Kata {
    public static String rot13(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                char shifted = (char) (c + 13);
                if (shifted > 'z') {
                    shifted = (char) (c - 13);
                }
                result.append(shifted);
            } else if (c >= 'A' && c <= 'Z') {
                char shifted = (char) (c + 13);
                if (shifted > 'Z') {
                    shifted = (char) (c - 13);
                }
                result.append(shifted);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
