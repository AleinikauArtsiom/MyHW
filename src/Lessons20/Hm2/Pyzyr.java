package Lessons20.Hm2;

import java.util.Arrays;

public class Pyzyr implements Runnable{
    private final int[] array = Main.array;
    @Override
    public void run() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Поменять местами элементы, если найден элемент меньше текущего минимального
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("PYZYR --> " + Arrays.deepToString(new int[][]{array}));
    }

}
