package Lessons17.Hm1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write you birthday yyyy/MM/dd");
        LocalDate birthDay = LocalDate.of(scan.nextInt(), scan.nextInt(),scan.nextInt());
        System.out.println(birthDay);
      birthDay =  birthDay.plusYears(100);

        System.out.println("tebe bydet 100 let v " + birthDay.getYear() + " gody");
    }
}
