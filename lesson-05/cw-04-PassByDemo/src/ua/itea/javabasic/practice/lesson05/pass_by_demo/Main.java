//D
package ua.itea.javabasic.practice.lesson05.pass_by_demo;
public class Main {
    public static void m(int x) {
        x = x + 10;
    }

    public static void m(int[] a) {
        a[0] = -1;
    }

    public static void main(String[] args) {
        int x = 1;
        System.out.println("x1 =" + x);    //1
        m(x);
        System.out.println("x2 =" + x);    //1

        int[] a = new int[] {1, 2, 3};
        m(a);
        System.out.println(java.util.Arrays.toString(a));   //[-1, 2, 3]
    }
}
