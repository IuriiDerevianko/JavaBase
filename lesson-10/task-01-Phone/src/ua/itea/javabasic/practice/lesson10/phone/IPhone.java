package ua.itea.javabasic.practice.lesson10.phone;
public class IPhone extends Phone {
    static int callCounter = 0;
    static int smsCounter = 0;
    protected String imei;

    public IPhone() {
        System.out.println("IPhone constructor");

        touch = true;
        hasWifi = true;
        screenSize = 3;
        number = "234-56-78";
    }

    @Override
    public void call(String number, Phone[] phones) {
        System.out.println("IPhone class is calling " + number);
        super.call(number, phones);
        callCounter++;
    }

    @Override
    public void sendSMS(String number, String message) {
        System.out.println("IPhone class is sending sms " + message + " to " + number);
        smsCounter++;
    }
}
