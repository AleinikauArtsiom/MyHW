package Lessons17.Hm4;

import java.util.Currency;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> greetings = x -> System.out.println("your amount in USD: " +  Integer.valueOf(x) / 3.1 );
        Scanner scan = new Scanner(System.in);
        System.out.println("Write amount BYN");
        greetings.accept(scan.nextLine());

    }
}
