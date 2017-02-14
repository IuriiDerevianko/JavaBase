package ua.itea.javabasic.practice.lesson06.timestablestaticclass;
public class CreaterTable {
    static int[] firstNumber;
    static int[] secondNumber;

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
}
