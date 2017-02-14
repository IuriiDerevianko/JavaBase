package ua.itea.javabasic.practice.lesson14.cw02;
public class Main {
    private static int x, y;
    public static void main(String[] args) {
        //int result = divide(x, y);
        int result = divide();
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

    private static int divide() {
        try {
            int x=1,y=0;
            int z=x/y;
            return z;
        }
        catch(ArithmeticException ex) {
            System.out.println("Delenie na 0;");
            return 0;
        }
    }
}




