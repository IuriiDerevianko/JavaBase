//D
package ua.itea.javabasic.practice.lesson05.himethods;
public class Main {
    public static void main(String[] args) {
        System.out.println(sum("Iurii", 23, 1000000.00));
        int[] mainArray= {1, 2, 3, 4, 5, 6, 7};
        System.out.println(array(mainArray));
        System.out.println(java.util.Arrays.toString(mainArray));
    }

    public static String sum(String a, int b, double c) {
        String s = (a + b + c);
        return s;
    }

    public static int array(int[] a){
        a[0]=a[0]+1;
        a[1]+=1;
        a[2]++;
        int sumArray = (a[0] + a[1] + a[2]);
        return sumArray;

    }
}
