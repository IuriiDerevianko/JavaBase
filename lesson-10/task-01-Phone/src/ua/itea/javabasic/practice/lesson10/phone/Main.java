//D
package ua.itea.javabasic.practice.lesson10.phone;
public class Main {
    public static void main(String[] args) {

        Nokia3310 nokia = new Nokia3310();
        IPhone iphone = new IPhone();
        IPhone5 iphone5 = new IPhone5();
        SamsungS4 samsungS4 = new SamsungS4();
        Phone[] phones = new Phone[] {nokia, iphone, iphone5, samsungS4};

        System.out.println("--------------------------------------------------");

        System.out.println("Nokia3310 screen size: " + nokia.getScreenSize());
        System.out.println("Nokia3310's number is: " + nokia.number + ";");
        nokia.call("234-56-78", phones);
        nokia.sendSMS("567-78-89", "first text message");
        nokia.sendSMS("567-78-89", "second text message");
        System.out.println("callCounter = " + nokia.callCounter + ";");
        System.out.println("smsCounter = " + nokia.smsCounter + ";");

        System.out.println("--------------------------------------------------");

        System.out.println("IPhone screen size: " + iphone.getScreenSize());
        System.out.println("IPhone's number is: " + iphone.number + ";");
        iphone.call("123-45-67", phones);
        iphone.sendSMS("567-78-89", "text message");
        System.out.println("callCounter = " + iphone.callCounter + ";");
        System.out.println("smsCounter = " + iphone.smsCounter + ";");

        System.out.println("--------------------------------------------------");

        System.out.println("IPhone5 screen size: " + iphone5.getScreenSize());
        System.out.println("IPhone5's number is: " + iphone5.number + ";");
        iphone5.call("456-78-90", phones);
        iphone5.sendSMS("567-78-89", "text message");
        System.out.println("callCounter = " + iphone5.callCounter + ";");
        System.out.println("smsCounter = " + iphone5.smsCounter + ";");

        System.out.println("--------------------------------------------------");

        System.out.println("SamsungS4 screen size: " + samsungS4.getScreenSize());
        System.out.println("SamsungS4's number is: " + samsungS4.number + ";");
        samsungS4.call("123-45-67", phones);
        samsungS4.sendSMS("567-78-89", "text message");
        System.out.println("callCounter = " + samsungS4.callCounter + ";");
        System.out.println("smsCounter = " + samsungS4.smsCounter + ";");
    }
}
