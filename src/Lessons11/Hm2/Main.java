package Lessons11.Hm2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("write text ");
        String inputString = scan.nextLine();
        System.out.println("number words - palendrom?");
        int wordNumber = scan.nextInt();
        String [] words = inputString.split("\\s+");
        if(words.length<wordNumber){
            System.out.println("lox");
        }

    }
}
