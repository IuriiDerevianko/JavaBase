package ua.itea.javabasic.practice.lesson14.journal;
public class IllegalNameException extends Exception {

    public IllegalNameException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "IllegalNameException: " + super.getMessage();
    }
}
