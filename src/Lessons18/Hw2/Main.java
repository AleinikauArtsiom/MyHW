package Lessons18.Hw2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*Задача 1:
        Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
        Stream'ов:
                - Удалить дубликаты
                - Оставить только четные элементы
                - Вывести сумму оставшихся элементов в стриме*/
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(7);
        numbers.add(9);
        numbers.add(10);
        numbers.add(8);
        numbers.add(8);
       int sum =  numbers.stream()
                .distinct()
                .filter(i -> i % 2 ==0)
               .mapToInt(Integer::intValue)
               .sum();
        System.out.println("summa elements " + sum);





    }
}
