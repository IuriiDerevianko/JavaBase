package ua.itea.javabasic.practice.lesson14.rectangle;
public class TooSmallWidthException extends IllegalWidthException {

    public TooSmallWidthException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "TooSmallWidthException: " + super.getMessage();
    }
}

