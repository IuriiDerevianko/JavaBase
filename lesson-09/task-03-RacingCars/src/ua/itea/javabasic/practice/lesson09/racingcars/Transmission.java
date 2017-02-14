package ua.itea.javabasic.practice.lesson09.racingcars;

class Transmission {
    public static Transmission SINGLE_SPEED = new Transmission(0);
    public static Transmission MANUAL = new Transmission(1);
    public static Transmission AUTOMATIC = new Transmission(2);
    public static Transmission SEMI_AUTOMATIC = new Transmission(3);

    private int type;

    private Transmission(int type) {
        this.type = type;
    }

    public boolean isEqualsTo(Transmission another) {
        // trivial comparision expressed in so many lines
        // just for simplicity, do not try to repeat it at home
        int t1 = this.type;
        int t2 = another.type;
        boolean result = t1 == t2;
        return result;
    }
}