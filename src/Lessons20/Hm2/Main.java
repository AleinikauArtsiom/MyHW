package Lessons20.Hm2;

import java.util.Arrays;

public class Main {
    static int[] array = {5,8,1,9,3,7,0,2,4,6,10,19,14,17,11,18,20,12,16,13,15};
    public static void main(String[] args) throws  InterruptedException {
        Pyzyr pyzyr1 = new Pyzyr();
        Thread sortirovkaPyzyr = new Thread(new Pyzyr());
        sortirovkaPyzyr.start();

        Vybor vybor1 = new Vybor();
        Thread sortirovkaVybor = new Thread(new Vybor());
        sortirovkaVybor.start();

        Vstavka vstavka1 = new Vstavka();
        Thread sortirovkaVstavka = new Thread(new Vstavka());
        sortirovkaVstavka.start();

        try {
            sortirovkaVstavka.join();
            sortirovkaPyzyr.join();
            sortirovkaVybor.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }



       /* Сортировка массива цифр в нескольких потоках различными алгоритмами:
        - сортировка вставками;
        - сортировка выбором;
        - сортировка пузырьком.
                Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
        результат отсортированных массивов в консоль.*/


    }
}
