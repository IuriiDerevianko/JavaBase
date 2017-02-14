//D
package ua.itea.javabasic.practice.lesson06.timestablestatic;
import java.util.Random;
public class Main {
    private static int[] firstNumber;
    private static int[] firstNumberRandom;
    private static int[] secondNumber;
    private static int[] secondNumberRandom;
    private static String[] result;

    public static void createTable() {

        int number = 2;
        firstNumber = new int[64];
        secondNumber = new int[64];
        for (int i = 0; i <= 63; ) {
            for (int j = 2; j <= 9; j++) {
                firstNumber[i] = number;
                secondNumber[i] = j;
                i++;
            }
            number++;
        }
    }

    public static void createRandomTable() {
        Random random = new Random();
        firstNumberRandom = new int[15];
        secondNumberRandom = new int[15];
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
    }

    public static void createResultRandomTable() {
        result = new String[15];
        for (int i = 0; i < result.length; i++) {
            result[i] = firstNumberRandom[i] + " * " + secondNumberRandom[i] + " = ___;";
        }
    }

    public static void outputResultRandomTable() {
        System.out.println("Please solve:");
        for (int i = 0; i < result.length; i++) {
            System.out.println((i + 1) + ") " + result[i]);
        }
    }

    public static void main(String[] args) {
        createTable();
        createRandomTable();
        createResultRandomTable();
        outputResultRandomTable();
    }
}