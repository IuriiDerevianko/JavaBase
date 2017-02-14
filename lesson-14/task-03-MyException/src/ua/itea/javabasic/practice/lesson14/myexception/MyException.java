package ua.itea.javabasic.practice.lesson14.myexception;
public class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "MyException: " + super.getMessage();
    }
}
