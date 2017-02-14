//D
package ua.itea.javabasic.practice.lesson08.autoparkremotecontrol;
public class Main {
    public static void main(String[] args) {

        Car[] carArray = new Car[10];
        for (int i = 0; i < carArray.length; i++) {
            carArray[i] = new Car();
        }

        AutoparkRemoteControl control = new AutoparkRemoteControl(carArray);
        System.out.println("Cars counter = " + Car.counter + ";");
        control.onCars();
        control.offCars();
    }
}
