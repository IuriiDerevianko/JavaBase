package ua.itea.javabasic.practice.lesson10.phone;
public abstract class Phone {
    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize;
    protected String number;

    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void call(String number, Phone[] phones) {
        System.out.println("Phone class is calling " + number);
        for (int i = 0; i < phones.length; i++) {
            if(number.equals(phones[i].number)){
                phones[i].answer();
            }
        }
    }

    public void answer() {
        System.out.println("Phone with number " + number + " answered;");
    }

    public abstract void sendSMS(String number, String message);
}
