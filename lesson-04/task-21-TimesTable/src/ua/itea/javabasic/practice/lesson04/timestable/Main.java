//D
package ua.itea.javabasic.practice.lesson04.timestable;
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        int number = 2;
        int[] firstNumber = new int[64];
        int[] secondNumber = new int[64];
        for (int i = 0; i <= 63; ) {
            for (int j = 2; j <= 9 ; j++) {
                firstNumber[i] = number;
                secondNumber[i] = j;
                i++;
            }
            number++;
        }
        //System.out.println(Arrays.toString(firstNumber));
        //System.out.println(Arrays.toString(secondNumber));

        Random random = new Random();
        int[] firstNumberRandom = new int[15];
        int[] secondNumberRandom = new int[15];
        int randomIndex = random.nextInt(63);

        for (int i = 0; i < 15; ) {
            randomIndex = random.nextInt(63);
            for (int j = 0; j < 15; j++) {
                if ((firstNumber[randomIndex] * secondNumber[randomIndex]) == (firstNumberRandom[j] * secondNumberRandom[j])) {
                    break;
                }
                if (j == 14) {
                    firstNumberRandom[i] = firstNumber[randomIndex];
                    secondNumberRandom[i] = secondNumber[randomIndex];
                    i++;
                }
            }
        }
        //System.out.println(Arrays.toString(firstNumberRandom));
        //System.out.println(Arrays.toString(secondNumberRandom));

        String[] result = new String [15];
        for (int i = 0; i < result.length; i++) {
            result[i] =  firstNumberRandom[i] + " * " + secondNumberRandom[i] + " = ___;";
        }
        //System.out.println(Arrays.toString(result));

        System.out.println("Please solve:");
        for (int i = 0; i < result.length; i++) {
            System.out.println((i+1) + ") " + result[i]);
        }
    }
}
