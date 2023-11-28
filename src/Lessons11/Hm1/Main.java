package Lessons11.Hm1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //SCANNER CONSOL
        System.out.println("write text for the first line");
        String string1 = scan.nextLine();
        System.out.println(string1);
        System.out.println("--------------------------------------");
        System.out.println("write text for the second line");
        String string2 = scan.nextLine();
        System.out.println(string2);
        System.out.println("--------------------------------------");

        System.out.println("write text for the third line");
        String string3 = scan.nextLine();
        System.out.println(string1);
        System.out.println("--------------------------------------");
        //порядок возрастания max min
        System.out.println("-------------LINE SIZE------------");
        System.out.println("string1 = " + string1.length());
        System.out.println("string2 = " + string2.length());
        System.out.println("string3 = " + string3.length());

        String[] strings = {string1, string2, string3};
        String shortest = Arrays.stream(strings).min(Comparator.comparingInt(String::length)).orElse("");
        String longest = Arrays.stream(strings).max(Comparator.comparingInt(String::length)).orElse("");
        System.out.println("max = " + longest);
        System.out.println("min = " + shortest);
        System.out.println("-------------------------");
        System.out.println(" line v poradke vozrastania dlinu : ");
        Arrays.stream(strings).sorted(Comparator.comparingInt(String :: length)).forEach(System.out::println);
                                                    //srednee
        double s123 = (string1.length() + string2.length() + string3.length()) / 3;
        System.out.println("srednee chislo " + s123);
        if (s123 > string1.length()){
            System.out.println("menshe sredney " + string1 + " dlina = " + string1.length());

        }
          if (s123 > string2.length()){
            System.out.println("menshe sredney " + string2 + "dlina = " + string2.length());

        }
          if (s123 > string3.length()){
             System.out.println("menshe sredney " + string3 + "dlina = " + string3.length());

         }
        System.out.println("---------------------");
                            //добавление в начало



    }

}
