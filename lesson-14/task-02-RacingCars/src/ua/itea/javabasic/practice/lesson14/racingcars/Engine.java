package ua.itea.javabasic.practice.lesson14.racingcars;
class Engine {
    private final double volume;
    private double mileage; // number of miles travel
    private boolean started;

    public Engine(double volume, double mileage) {
        if(volume < 0) {
            throw new IllegalArgumentException("Negative volume value;");
        }
        this.volume = volume;

        if(mileage < 0) {
            throw new IllegalArgumentException("Negative mileage value;");
        }
        this.mileage = mileage;
    }

    public void on() {
        this.started = true;
    }

    public void off() {
        this.started = false;
    }

    public void go(double mileage) {
        if (started) {
            mileage += mileage;
        } else {
            // ...handle inability to go...
            System.err.println("Cannot Go(), you must start engine first!");
        }
    }

    public boolean isStarted() {
        return started;
    }

    public double calcAverageFuelConsumptionLevel() {
        double result = -3;
        if (volume < 1 || volume > 5) {
            // out of range error
            return -1;
        } else if (1.0 <= volume && volume <= 1.9) {
            result += 6;
        } else if (2.0 <= volume && volume <= 2.9) {
            result += 10;
        } else if (3.0 <= volume && volume <= 4.1) {
            result += 16;
        } else {
            result += 20;
        }
        result += 3 * (1 + (mileage / 100_000.0));
        return result;
    }
}