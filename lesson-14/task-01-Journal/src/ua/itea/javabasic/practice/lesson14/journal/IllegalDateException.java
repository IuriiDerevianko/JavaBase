package ua.itea.javabasic.practice.lesson14.journal;
public class IllegalDateException extends Exception {

    public IllegalDateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "IllegalDateException: " + super.getMessage();
    }
}
