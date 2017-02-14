//D
package ua.itea.javabasic.practice.lesson08.maxboxtask;
public class Main {
    public static void main(String[] args) {
        MaxBox box = MaxBox.newInstance();
        box.setValue(-100500);
        box.setValue(-1024);
        box.setValue(0);
        box.setValue(1025);
        box.setValue(100500);
        box.setValue(1024);
        System.out.println("Result is: " + box.getValue() + ";");
    }
}
