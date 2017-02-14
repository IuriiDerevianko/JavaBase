//D
package ua.itea.javabasic.practice.lesson16.cycliccounter;
public class Main {
    public static void main(String[] args) {
        CyclicCounter c = new CyclicCounter();
        c.start();

        try { Thread.sleep(30000); }
        catch (Exception e) {e.printStackTrace();}

        c.interrupt();
    }
}
