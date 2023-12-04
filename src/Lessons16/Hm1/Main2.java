package Lessons16.Hm1;

import java.util.HashMap;
import java.util.Map;

public class Main2 {
    public static void main(String[] args) {
        String [] array = {"a", "b", "c", "d", "e", "c", "f", "a", "g", "k", "l", "k", "m"};

            Map<String, Boolean> map = new HashMap<>();
            for (int i = 0; i < array.length; i++) {
                boolean flag = false;
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

        System.out.println(map);
        }
    }



