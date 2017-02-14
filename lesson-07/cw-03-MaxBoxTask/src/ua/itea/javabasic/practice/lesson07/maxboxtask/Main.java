//D
package ua.itea.javabasic.practice.lesson07.maxboxtask;
public class Main {
    public static void main(String[] args) {
        MaxBox box = new MaxBox();
        box.setValue(-2);
        box.setValue(-1);
        box.setValue(0);
        box.setValue(3);
        box.setValue(1);
        box.setValue(2);
        System.out.println("Result is: " + box.getValue() + ";");
    }
}
