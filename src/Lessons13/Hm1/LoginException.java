package Lessons13.Hm1;

public class LoginException extends Exception{
    public LoginException() {
        super("wrong login");
    }

    public LoginException(String message) {
        super(message);
    }

}
