package Lessons9.Shape;
   /*Задача 2:
           Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
           функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
           абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран
           сумму периметра всех фигур в массиве. */


import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapee[] shapee = new Shapee[3];
        shapee[0] = new isoscelesTriangle(4,4,5);
        shapee[1] = new Rectangle(2,3);
        shapee[2] = new Circle(15);

        double sumPP = 0;
        for (Shapee shapee1 : shapee){
            sumPP += shapee1.pP();

        }
        double sumSS = 0;
        for (Shapee shapee2 : shapee){
            sumSS += shapee2.sS();
        }
        System.out.println("sum pP all shape =  " + String.format("%.2f",sumPP));
        System.out.println("sum sS all shape = " + String.format("%.2f",sumSS));

    }
}
