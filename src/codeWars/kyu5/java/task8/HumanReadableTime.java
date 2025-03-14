package codeWars.kyu5.java.task8;

// https://www.codewars.com/kata/52685f7382004e774f0001f7/java
public class HumanReadableTime {
    public static String makeReadable(int seconds) {

        int hoursValue = seconds / 3600;
        int minutesValue = (seconds % 3600) / 60;
        int secondsValue = seconds % 60;

        return String.format("%02d:%02d:%02d", hoursValue, minutesValue, secondsValue);
    }
}
