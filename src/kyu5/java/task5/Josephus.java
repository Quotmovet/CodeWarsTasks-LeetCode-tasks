package kyu5.java.task5;

import java.util.ArrayList;
import java.util.List;

// https://www.codewars.com/kata/5550d638a99ddb113e0000a2
public class Josephus {

    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {

        ArrayList<T> result = new ArrayList<>();
        int index = 0;

        while (!items.isEmpty()) {
            index = (index + k - 1) % items.size();
            T value = items.remove(index);
            result.add(value);

            System.out.println(items + " => " + value + " is counted out and goes into the result " + result);
        }

        return result;
    }
}