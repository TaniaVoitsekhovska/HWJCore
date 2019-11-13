package homework_12.hw12_2;

public class WrongInputConsoleParametrException extends Exception {

   private String message;

    public WrongInputConsoleParametrException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
