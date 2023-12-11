package Lessons20.Hm1;

import java.util.Scanner;

public class Main {
    static int[] array = {0,1,2,3,4,5,6,11,8,9};
    static int max;
    static int min;

    public static void main(String[] args) throws  InterruptedException {
        /*Задача 1:
        Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
        потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
        вычислений возвращаются в метод main().*/
       // Scanner scan = new Scanner(System.in);
        Thread threadMax = new Thread(new Maxmax());
        Thread threadMin = new Thread(new Minmin());
       // System.out.println("Write number 1 -- MAX; write number 2 -- MIN");
       try {
         //  int number = scan.nextInt();
          // if (number == 1) {
               threadMax.start();
               threadMax.join();

         //  }
          // if (number == 2) {
               threadMin.start();
               threadMin.join();

          // }
          // scan.close();

       } catch (InterruptedException e ) {
        e.printStackTrace();

        }




    }
}
