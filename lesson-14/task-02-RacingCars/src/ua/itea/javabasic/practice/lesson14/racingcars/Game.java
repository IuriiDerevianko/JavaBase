package ua.itea.javabasic.practice.lesson14.racingcars;
class Game {
    private Car[] cars = null;

    public void start() {
        Car brandNewMazda = new Car("Mazda", "6", new Engine(2.0, 0), Transmission.MANUAL, "haven't regime");
        Car hybd = new Car("Hyundai", "Santa Fe Sport", new Engine(2.7, 16300), Transmission.MANUAL, "haven't regime");
        Car oldBmw = new Car("BMW", "X6", new Engine(4.4, 100500), Transmission.AUTOMATIC, "haven't regime");
        Car WvGolf = new Car("WV", "Golf", new Engine(1.6, 0), Transmission.MANUAL, "sport");
        Car WvPolo = new Car("WV", "Polo", new Engine(1.6, 0), Transmission.AUTOMATIC, "eco");

        cars = new Car[] {brandNewMazda, hybd, oldBmw, WvGolf, WvPolo};

        for (Car c : cars) {
            c.setFuel(60);
        }

        for (Car c : cars) {
            c.on();
            c.drive((float) Math.random() * 3.5f, 70);
        }

        for (Car c : cars) {
            System.out.printf("%s; F = %.1f%n", c.getManufacturer(), c.getFuel());
        }
    }
}