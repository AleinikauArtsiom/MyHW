package Job;/*Задача 1:
        Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с
        методом, который печатает название должности и имплементировать этот метод в
        созданные классы.
        Задача 2:
        Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
        функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
        абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран
        сумму периметра всех фигур в массиве. */

public class Main {
    public static void main(String[] args) {
      Director director1 = new Director();
      Buhgalter buhgalter1 = new Buhgalter();
      Rabochi rabochi1 = new Rabochi();
      rabochi1.printJobTitle();
      buhgalter1.printJobTitle();
      director1.printJobTitle();
    }
}
