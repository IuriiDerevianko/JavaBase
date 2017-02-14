package ua.itea.javabasic.practice.lesson14.rectangle;
public class TooSmallHeightException extends IllegalHeightException {

    public TooSmallHeightException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "TooSmallHeightException: " + super.getMessage();
    }
}

