package Lessons20.Hm2;

import java.util.Arrays;

public class Vybor implements  Runnable{
    private final int[] array = Main.array;

    public void run() {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("VYBOR --> " + Arrays.deepToString(new int [][]{array}));
    }

}
