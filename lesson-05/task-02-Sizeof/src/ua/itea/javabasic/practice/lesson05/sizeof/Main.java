//D
package ua.itea.javabasic.practice.lesson05.sizeof;
public class Main {
    public static void main(String[] args) {
        long [] mainArray = new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("You entered array: " + java.util.Arrays.toString(mainArray) + ";");
        System.out.println("Size array is " + sizeArray(mainArray) + " byte;");
    }

    public static int sizeArray(byte[] a) {
        int size = 1 * a.length + 4 + 8;
        System.out.println("This array is byte type;");
        return size;
    }

    public static int sizeArray(short[] a) {
        int size = 2 * a.length + 4 + 8;
        System.out.println("This array is short type;");
        return size;
    }

    public static int sizeArray(int[] a) {
        int size = 4 * a.length + 4 + 8;
        System.out.println("This array is integer type;");
        return size;
    }

    public static int sizeArray(long[] a) {
        int size = 8 * a.length + 4 + 8;
        System.out.println("This array is long type;");
        return size;
    }

    public static int sizeArray(float[] a) {
        int size = 4 * a.length + 4 + 8;
        System.out.println("This array is float type;");
        return size;
    }

    public static int sizeArray(double[] a) {
        int size = 8 * a.length + 4 + 8;
        System.out.println("This array is double type;");
        return size;
    }

}
