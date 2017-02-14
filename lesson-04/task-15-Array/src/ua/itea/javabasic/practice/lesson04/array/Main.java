//D
package ua.itea.javabasic.practice.lesson04.array;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[29044];
        int j = 0;
        for (int i = -312; i <= 28731; i++, j++) {
            array[j] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
