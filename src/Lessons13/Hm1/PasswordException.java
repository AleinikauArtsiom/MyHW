package Lessons13.Hm1;

public class PasswordException extends Exception{
    public PasswordException() {
        super("wrong password");
    }

    public PasswordException(String message) {
        super(message);
    }
}
