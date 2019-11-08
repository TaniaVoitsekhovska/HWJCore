package homework_8_and_9.hw8_1_9_1;

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
