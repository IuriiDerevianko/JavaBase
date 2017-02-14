package ua.itea.javabasic.practice.lesson13.racingcarsenum;
enum Transmission {
    SINGLE_SPEED, MANUAL, AUTOMATIC, SEMI_AUTOMATIC;
    public boolean isEqualsTo(Transmission another) {
        boolean result = (this == another);
        return result;
    }
}
