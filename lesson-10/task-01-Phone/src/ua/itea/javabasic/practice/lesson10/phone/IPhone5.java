package ua.itea.javabasic.practice.lesson10.phone;

public class IPhone5 extends IPhone {
    static int callCounter = 0;
    static int smsCounter = 0;

    public IPhone5() {
        System.out.println("IPhone5 constructor");
        screenSize = 4;
        imei = "1111111";
        number = "345-67-89";
    }

    @Override
    public void call(String number, Phone[] phones) {
        System.out.println("IPhone5 class is calling " + number);
        super.call(number, phones);
        callCounter++;
    }

    @Override
    public void sendSMS(String number, String message) {
        super.sendSMS(number, message);
        System.out.println("IPhone5 class is sending sms " + message + " to " + number);
       smsCounter++;
    }
}
