package Lessons13.Hm1;

import java.util.Scanner;
/*
Создать класс, в котором будет статический метод. Этот метод принимает на вход три
        параметра: login, password, confirmPassword. Все поля имеют тип данных String. Длина
        login должна быть меньше 20 символов и не должен содержать пробелы. Если login не
        соответствует этим требованиям, необходимо выбросить WrongLoginException. Длина
        password должна быть меньше 20 символов, не должен содержать пробелом и должен
        содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.
        Если password не соответствует этим требованиям, необходимо выбросить
        WrongPasswordException. WrongPasswordException и WrongLoginException -
        пользовательские классы исключения с двумя конструкторами – один по умолчанию,
        второй принимает сообщение исключения и передает его в конструктор класса
        Exception. Метод возвращает true, если значения верны.
*/


public class Main {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws LoginException, PasswordException {
        System.out.print("Enter a login witch can be without space and have 20 symbols: ");
        String login = scanner.nextLine();
        System.out.print("Enter a password:");
        String password = scanner.nextLine();
        System.out.print("inform password: ");
        String confirmPassword = scanner.nextLine();
        if(!passwordIsValid(password,confirmPassword)){
            throw new PasswordException("incorrect input");
        }
        if (!loginIsValid(login)) {
            throw new LoginException("incorrect input");
        }

    }

    private static boolean loginIsValid(String login) {
        if (login.length() >= 20 || login.contains(" ")) {
            return false;
        }
        return true;
    }

    private static boolean passwordIsValid(String password, String confirmPassword) {
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
            return false;
        }
        return true;
    }
}
