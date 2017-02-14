//D
package ua.itea.javabasic.practice.lesson03.variables;
public class Main {
    public static void main(String[] args) {
        int myVariable;

        int i = 1;
        double d = 7.5;
        long var1 = 100000, var2 = 33333;
        char symbol = 'A';
        boolean e = true;
        short f = 500;
        int g = f + 300;
        String greating = "Hello World";

        myVariable = 55;
        System.out.println(e);
        System.out.println(myVariable + i + d + var1 + var2 + symbol + f +g);

        String intString = Integer.toString(1);
        String longString = Long.toString(Long.MAX_VALUE);
        String floatString = Float.toString(Float.MAX_VALUE);
        String doubleString = Double.toString(Double.MAX_VALUE);

        int a = Integer.parseInt("0123456789");
        long b = Long.parseLong(longString);
        float f2 = Float.parseFloat(floatString);
        double d2 = Double.parseDouble(doubleString);
        System.out.println("int a = "+a+" ;");
        System.out.println("long b = "+b+" ;");
        System.out.println("float f2 = "+f2+" ;");
        System.out.println("double d2 = "+d2+" ;");

    }
}