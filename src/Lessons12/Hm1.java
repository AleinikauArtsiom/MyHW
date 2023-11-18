package Lessons12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hm1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // String line = scan.nextLine();
        Pattern pattern = Pattern.compile("[A-Z]{2,6}");
        Matcher matcher = pattern.matcher(scan.nextLine());
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
