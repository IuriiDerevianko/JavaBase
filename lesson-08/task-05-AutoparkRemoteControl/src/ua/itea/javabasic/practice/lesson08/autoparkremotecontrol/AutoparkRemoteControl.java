package ua.itea.javabasic.practice.lesson08.autoparkremotecontrol;
public class AutoparkRemoteControl {
    private Car[] saveArray;

    public AutoparkRemoteControl(Car[] carArray) {
        saveArray = new Car[carArray.length];
        saveArray = carArray;
    }

    public void onCars() {
        if(saveArray != null) {
            for (int i = 0; i < saveArray.length ; i++) {
                saveArray[i].on();
            }
        }
    }

    public  void offCars() {
        if(saveArray != null) {
            for (int i = 0; i < saveArray.length ; i++) {
                saveArray[i].off();
            }
        }
    }

}

