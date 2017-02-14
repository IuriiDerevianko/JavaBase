package ua.itea.javabasic.practice.lesson16.timestamp;
public class Timestamp extends Thread {
    public void run() {
        while(!isInterrupted()) {
            try {
                System.out.println(System.currentTimeMillis());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println();
                System.out.println("sleep() interrupted!");
                return;
            }
        }
        System.out.println("isInterrupted() : false");
    }
}
