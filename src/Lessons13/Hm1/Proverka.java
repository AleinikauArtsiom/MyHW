package Lessons13.Hm1;

public class Proverka {
    public static boolean checkInputData (String login, String password, String confirmPassword) throws LoginException, PasswordException {
        if (login.length()>=20 || login.contains(" ")){
            throw new LoginException();
        }
        if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
            throw new PasswordException();
        }

        return true;
    }
}
