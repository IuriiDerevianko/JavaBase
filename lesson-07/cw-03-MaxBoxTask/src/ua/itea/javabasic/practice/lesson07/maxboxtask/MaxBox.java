package ua.itea.javabasic.practice.lesson07.maxboxtask;
class MaxBox {
    private int i = 0;

    public void setValue(int i) {
        if((i >= 0) && (i > this.i)) {
            this.i = i;
        }
    }
    public int getValue() {
        return i;
    }
}
