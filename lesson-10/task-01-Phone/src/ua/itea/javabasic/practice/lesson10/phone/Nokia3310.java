package ua.itea.javabasic.practice.lesson10.phone;
public class Nokia3310 extends Phone {
    static int callCounter = 0;
    static int smsCounter = 0;

    public Nokia3310() {
        System.out.println("Nokia3310 constructor");

        touch = false;
        hasWifi = false;
        screenSize = 2;
        number = "123-45-67";
    }

    @Override
    public void call(String number, Phone[] phones) {
        System.out.println("Nokia3310 class is calling " + number);
        super.call(number, phones);
        callCounter++;
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("Nokia3310 class is sending sms " + message + " to " + number);
        smsCounter++;
    }
}
