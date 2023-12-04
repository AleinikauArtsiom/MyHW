package Lessons16.Hm1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] array = {"bye","yy", "a", "b", "c", "d", "e", "f", "g", "a", "c", "yy", "y", "y", "y","hello","hello"};
        wordMult(array).forEach((k, v) -> System.out.println(k + ": " + v));

    }
// НЕ РАБОЧИЙ
    private static Map<String, Boolean> wordMult(String[] array) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i].equals(array[j])) {
                    map.put(array[i], true);
                    flag = true;
                }
            }
            if (!flag) {
                map.put(array[i], false);
            }
        }

        return map;
    }
}
