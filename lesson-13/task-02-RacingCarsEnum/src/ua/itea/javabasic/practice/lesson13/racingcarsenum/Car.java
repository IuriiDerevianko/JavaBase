package ua.itea.javabasic.practice.lesson13.racingcarsenum;
class Car {
    public static final String DEFAULT_TRACK = "Unknown - Track 1";
    private final String manufacturer;
    private final String model;
    private final Engine engine;
    private final Transmission transmission;
    private final Audio audio;
    private double fuel;
    private String regime;

    public Car(String manufacturer, String model, Engine engine, Transmission transmission, String regime) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.engine = engine;
        this.transmission = transmission;
        this.audio = new Audio();
        this.audio.setTrack(DEFAULT_TRACK);
        this.regime = regime;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void on() {
        engine.on();
    }

    public void off() {
        engine.off();
    }

    public void setFuel(double fuel) {
        if (fuel > 0) {
            this.fuel = fuel;
        }
    }

    public double getFuel() {
        return fuel;
    }

    // time in hours; speed in mph
    public boolean drive(float time, int speed) {
        boolean success;
        double consumption;
        if (engine.isStarted() && fuel > 0) {
            double distanceToPass = speed * time;

            //sport or eco;
            if(regime.equalsIgnoreCase("sport")) {
                consumption = 1.4 * engine.calcAverageFuelConsumptionLevel();
            }
            else {
                if(regime.equalsIgnoreCase("eco")) {
                    consumption = 0.7 * engine.calcAverageFuelConsumptionLevel();
                }
                else {
                    consumption = engine.calcAverageFuelConsumptionLevel();
                }
            }

            //type transmission;
            if(transmission.isEqualsTo(Transmission.SINGLE_SPEED)) {
                consumption *= 1.0;
            }
            if(transmission.isEqualsTo(Transmission.MANUAL)) {
                consumption *= 0.9;
            }
            if(transmission.isEqualsTo(Transmission.AUTOMATIC)) {
                consumption *= 0.8;
            }
            if(transmission.isEqualsTo(Transmission.SEMI_AUTOMATIC)) {
                consumption *= 0.85;
            }

            double consumedFuel = distanceToPass / 100 * consumption;
            double div = fuel / consumedFuel;
            if (div < 1) {
                consumedFuel = fuel;
                distanceToPass = consumedFuel / 100 * consumption;
                success = false;
            } else {
                success = true;
            }
            // --- update this object state ---
            fuel -= consumedFuel; // decreasing fuel
            engine.go(distanceToPass); // increasing mileage
        } else {
            //...handle error here...
            System.err.println("Cannot drive. Start engine first!");
            success = false;
        }
        return success;
    }

    public void playMusic() {
        boolean on = true;
        byte volume = 50;
        audio.turn(on);
        audio.setVolume(volume);
        audio.play();
    }

    public void stopMusic() {
        boolean off = false;
        audio.turn(off);
    }
}