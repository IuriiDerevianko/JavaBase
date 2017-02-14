//D
package ua.itea.javabasic.practice.lesson10.car;
public class Main {
    public static void main(String[] args) {
        WV touareg = new WV();
        touareg.carInform("Touareg", 3.0, 100.0);
        touareg.beep("Touareg");
        System.out.println("---------------------------------");

        BMW x6 = new BMW();
        x6.carInform("X6", 3.6, 100.0);
        x6.beep("X6");
        System.out.println("---------------------------------");

        Skoda yeti = new Skoda();
        yeti.carInform("Yeti", 1.8, 100.0);
        yeti.beep("Yeti");
        System.out.println("---------------------------------");
    }
}
