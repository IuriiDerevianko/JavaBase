package ua.itea.javabasic.practice.lesson14.rectangle;
public class IllegalWidthException extends Exception {
     public IllegalWidthException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "IllegalWidthException: " + super.getMessage();
    }
}
