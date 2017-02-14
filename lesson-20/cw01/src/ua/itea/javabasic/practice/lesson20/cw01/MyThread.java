package ua.itea.javabasic.practice.lesson20.cw01;
public class MyThread extends Thread {
private DynamicArray array;

    public MyThread (DynamicArray array) {
        this.array =  array;
    }
    public void run() {
        System.out.println("Hello Iurii!");
    }

}
