//D
package ua.itea.javabasic.practice.lesson08.car;
public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car(91);
        System.out.println("1) firstCar, fuel = " + firstCar.getFuel() + ";");
        firstCar.on();
        firstCar.drive();
        firstCar.off();
        Car secondCar = new Car();
        System.out.println("2) secondCar, fuel = " + secondCar.getFuel() + ";");
        secondCar.on();
        secondCar.drive();
        secondCar.off();
        System.out.println();
        System.out.println("Cars counter = " + Car.counter + ";");
    }
}
