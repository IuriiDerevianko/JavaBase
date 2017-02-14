package ua.itea.javabasic.practice.lesson14.rectangle;
public class IllegalHeightException extends Exception {

    public IllegalHeightException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "IllegalHeightException: " + super.getMessage();
    }
}
