package ua.itea.javabasic.practice.lesson10.car;
public class Skoda extends Car {
    public Skoda() {
        System.out.println("Skoda constructor;");
        id = 123454321;
    }

    @Override
    public void carInform(String model, double engine, double fuel){
        System.out.println("Model: " + model + ";");
        System.out.println("Engine: " + engine + ";");
        System.out.println("Fuel: " + fuel + ";");
    }

    @Override
    public void beep(String model) {
        System.out.println(model + " is BEEPing!");
    }
}
