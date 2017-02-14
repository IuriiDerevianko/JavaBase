package ua.itea.javabasic.practice.lesson16.interrupt;
public class InterruptSecond extends Thread {
    public void run() {
        try {
            System.out.println(getId() + ", " + getName() + " : hello");
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            return;
        }
    }
}
