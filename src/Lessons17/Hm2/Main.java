package Lessons17.Hm2;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, -6, 4, -2, 4, -9};
        Predicate<Integer> pred1 = i -> i > 0;
             for(int c =0; c < array.length; c++){
                 if (pred1.test(array[c]) == true){
                     System.out.println(array[c] + " " + pred1.test(array[c]));
                 }
             }
    }
}



