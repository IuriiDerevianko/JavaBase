package ua.itea.javabasic.practice.lesson08.maxboxtask;
public class MaxBox {
    private int i = 0;
    private static final int MAX_VALUE = 1024;

    private MaxBox() {

    }

    public void setValue(int i) {
        if((i >= 0) && (i > this.i)) {
            this.i = i;
        }
        if(i >= MAX_VALUE) {
            this.i = MAX_VALUE;
        }
    }

    public int getValue() {
        return i;
    }

    public static MaxBox newInstance() {
        MaxBox box = new MaxBox();
        return box;
    }
}
