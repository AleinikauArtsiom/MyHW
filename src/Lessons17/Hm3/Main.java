package Lessons17.Hm3;

import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Double> valueConverter = x -> Integer.valueOf(x) /3.1;
        Scanner scan = new Scanner(System.in);
        System.out.println("write amount BYN");
        System.out.println("----------------");
        System.out.print( "your amount in USD:" + valueConverter.apply(scan.next()));

    }
}

