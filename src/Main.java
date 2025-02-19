import task5.Josephus;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> items = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        Josephus.josephusPermutation(items, 3);

        System.out.println(4 % 5);

    }
}
