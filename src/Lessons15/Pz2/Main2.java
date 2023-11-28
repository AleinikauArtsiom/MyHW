package Lessons15.Pz2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Class klas = new Class();
        Scanner scan = new Scanner(System.in);
        System.out.println("write animals (for break program write finish)");
        while (true) {
            String input = scan.nextLine();
            if (input.equals("finish")) {
                break;
            }
            klas.addAnimals(input);
        }
        System.out.println("----------------");
        klas.deleteAnimals();
        System.out.println("------------------");
        klas.ssout();

    }
}