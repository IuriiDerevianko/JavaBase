package ua.itea.javabasic.practice.lesson14.cw01;
public class Main {
    private static int x, y;
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(2000);
        int result = divide(x, y);   //Uncaught RTE
        System.out.println(result);
        System.out.println("IMPORTANT: To defuse the bomb enter ");
        System.out.println(result + " 7 3 2 5 6 ");
        System.out.println(" then press <Off> ");
    }

    private static int divide(int a, int b) {
        if(b != 0) {
            int z = a / b;
            return z;
        }
        else {
            return 0;
        }
    }
}
