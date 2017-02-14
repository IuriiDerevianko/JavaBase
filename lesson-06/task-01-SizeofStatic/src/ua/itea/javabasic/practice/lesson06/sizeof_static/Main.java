package ua.itea.javabasic.practice.lesson06.sizeof_static;
public class Main {
    static  int sizeArray;

    public static void main(String[] args) {
        long [] mainArray = new long[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("You entered array: " + java.util.Arrays.toString(mainArray) + ";");
        sizeArraySearcher(mainArray);
        System.out.println("Size array is " + sizeArray + " byte;");
    }

    public static void sizeArraySearcher(byte[] a) {
        sizeArray = a.length + 4 + 8;
        System.out.println("This array is byte type;");
    }

    public static void sizeArraySearcher(short[] a) {
        sizeArray = 2 * a.length + 4 + 8;
        System.out.println("This array is short type;");
    }

    public static void sizeArraySearcher(int[] a) {
        sizeArray = 4 * a.length + 4 + 8;
        System.out.println("This array is integer type;");
    }

    public static void sizeArraySearcher(long[] a) {
        sizeArray = 8 * a.length + 4 + 8;
        System.out.println("This array is long type;");
    }

    public static void sizeArraySearcher(float[] a) {
        sizeArray = 4 * a.length + 4 + 8;
        System.out.println("This array is float type;");
    }

    public static void sizeArraySearcher(double[] a) {
        sizeArray = 8 * a.length + 4 + 8;
        System.out.println("This array is double type;");
    }

}
