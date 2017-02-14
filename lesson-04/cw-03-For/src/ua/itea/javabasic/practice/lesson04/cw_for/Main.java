//D
package ua.itea.javabasic.practice.lesson04.cw_for;
public class Main {
    public static void main(String[] args) {
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = (-9)+(2*i);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
