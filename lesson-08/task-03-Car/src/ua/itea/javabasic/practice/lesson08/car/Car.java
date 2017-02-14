package ua.itea.javabasic.practice.lesson08.car;
public class Car {
    private int fuel;
    public static int counter;

    public Car() {
        fuel = 100;
        counter++;
    }

    public Car(int fuel) {
        this.fuel = fuel;
        counter++;
    }

    public int getFuel() {
        return fuel;
    }

    public void on() {
        System.out.println("\tMotor is on;");
    }

    public void off() {
        System.out.println("\tMotor is off;");
    }

    public void drive() {
        System.out.println("\tCar is driving;");
    }
}
