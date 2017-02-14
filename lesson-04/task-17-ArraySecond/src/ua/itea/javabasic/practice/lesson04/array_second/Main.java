//D
package ua.itea.javabasic.practice.lesson04.array_second;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[29044];
        int j = 29043;
        for (int i = 28731; i >= -312; i--, j--) {
            array[j] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
