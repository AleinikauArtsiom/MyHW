package Lessons20.Hm2;

import java.util.Arrays;

public class Vstavka implements Runnable {
    private final int[] array = Main.array;

    public void run() {
        int n = array.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        // Поменять элементы местами, если они стоят в неправильном порядке
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("VSTAVKA --> " + Arrays.deepToString(new int[][]{array}));
    }

}
