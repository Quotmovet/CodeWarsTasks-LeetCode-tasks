package task6;

import java.util.HashMap;
import java.util.Map;

// https://www.codewars.com/kata/58e24788e24ddee28e000053/train/java
public class SimpleAssembler {
    public static Map<String, Integer> interpret(String[] program){

        Map<String, Integer> map = new HashMap<>();
        int index = 0;

        while(index < program.length){
            String[] commandValue = program[index].split(" ");
            String command = commandValue[0];
            String x = commandValue[1];

            switch (command){
                case "mov":
                    int value = isNumber(commandValue[2]) ? Integer.parseInt(commandValue[2]) : map.get(commandValue[2]);
                    map.put(x, value);
                    break;

                case "inc":
                    map.put(x, map.get(x) + 1);
                    break;

                case "dec":
                    map.put(x, map.get(x) - 1);
                    break;

                case "jnz":
                    int checkValue = isNumber(x) ? Integer.parseInt(x) : map.getOrDefault(x, 0);
                    int jump = isNumber(commandValue[2]) ? Integer.parseInt(commandValue[2]) : map.getOrDefault(commandValue[2], 0);
                    if (checkValue != 0) {
                        index += jump;
                        continue;
                    }
                    break;
            }
            index++;
        }

        return map;
    }

    private static boolean isNumber(String s) {
        return s.matches("-?\\d+");
    }
}