package ua.itea.javabasic.practice.lesson10.car;
public class BMW extends Car {
    public BMW() {
        System.out.println("BMW constructor;");
        id = 987654321;
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
