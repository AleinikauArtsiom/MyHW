package Lessons13.Hm1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a login witch can be without space and have 20 symbols: ");
        String login = scan.nextLine();
        System.out.print("Enter a password:");
        String password = scan.nextLine();
        System.out.print("inform password: ");
        String confirmPassword = scan.nextLine();
        try {
            boolean isValid = Proverka.checkInputData(login, password, confirmPassword);
            if (isValid){
                System.out.println("good");
            }
        } catch(PasswordException | LoginException e){
            System.out.println("error!!!! " + e.getMessage());


        }

    }
}
