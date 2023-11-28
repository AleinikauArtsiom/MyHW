package Lessons15;

import java.util.HashSet;
import java.util.Scanner;

public class Pz1 {
    public static void main(String[] args) {
        HashSet <Integer> numberSet = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("write number (for break program write finish) ");
        while (true){
            String ffinish = scan.nextLine();
            if(ffinish.equals("finish") ){
                break;
            }
            try{
                int number = Integer.parseInt(ffinish);
                numberSet.add(number);
            } catch (NumberFormatException e){
                System.out.println("error");
            }
        }
        System.out.println("number in HashSet " + numberSet);

    }
}
