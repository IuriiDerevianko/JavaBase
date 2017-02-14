//D
package ua.itea.javabasic.practice.lesson12.overflows;
public class Main {

    public static void inspection(int a, int b){
        long la = a;
        long lb = b;
        long c = la + lb;
        assert((c <= Integer.MAX_VALUE)&&(c >= Integer.MIN_VALUE));
    }

    public static void main(String[] args) {
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE + ";");
        System.out.println("Byte.MAX_VALUE + 1 = " + (byte)(Byte.MAX_VALUE + 1) + ";");
        System.out.println();

        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE + ";");
        System.out.println("Short.MAX_VALUE + 1 = " + (short)(Short.MAX_VALUE + 1) + ";");
        System.out.println();

        System.out.println("Character.MAX_VALUE = " + Character.MAX_VALUE + ";");
        System.out.println("Character.MAX_VALUE + 1 = " + (char)(Character.MAX_VALUE + 1) + ";");
        System.out.println();

        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE + ";");
        System.out.println("Long.MAX_VALUE + 1 = " + (Long.MAX_VALUE + 1) + ";");
        System.out.println();

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE + ";");
        System.out.println("Integer.MAX_VALUE + 1 = " + (Integer.MAX_VALUE + 1) + ";");
        System.out.println();

        inspection(Integer.MAX_VALUE, 1);
    }
}