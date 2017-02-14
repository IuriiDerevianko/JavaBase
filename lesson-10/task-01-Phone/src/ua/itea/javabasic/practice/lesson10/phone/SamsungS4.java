package ua.itea.javabasic.practice.lesson10.phone;
public class SamsungS4 extends Phone {
    static int callCounter = 0;
    static int smsCounter = 0;

    public SamsungS4() {
        System.out.println("SamsungS4 constructor");

        touch = true;
        hasWifi = true;
        screenSize = 5;
        number = "456-78-90";
    }

    @Override
    final public void call(String number, Phone[] phones) {
        System.out.println("SamsungS4 class is calling " + number);
        super.call(number, phones);
        callCounter++;
    }

    @Override
    public void sendSMS(String number, String message) {
        message = "Hello " + message;
        System.out.println("SamsungS4 class is sending sms " + message + " to " + number);
        smsCounter++;
    }
}
