package ua.itea.javabasic.practice.lesson10.car;
public class WV extends Car{

    public WV() {
        System.out.println("WV constructor;");
        id = 123456789;
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
