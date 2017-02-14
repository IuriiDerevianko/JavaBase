package ua.itea.javabasic.practice.lesson06.timestablestaticclass;
import java.util.Random;
public class CreaterRandomTable {
    static int[] firstNumberRandom;
    static int[] secondNumberRandom;

    public static void createRandomTable(int[] firstNumber, int[] secondNumber) {
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
}
