//D
package ua.itea.javabasic.practice.lesson12.task3;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void addition(float[] workArray, float... secondNumber) {
        for (int i = 0; i < workArray.length; i++) {
            for(float f : secondNumber) {
                workArray[i] += f;
            }
        }
    }

    public static void substraction(float[] workArray, float... secondNumber) {
        for (int i = 0; i < workArray.length; i++) {
            for(float f : secondNumber) {
                workArray[i] -= f;
            }
        }
    }

    public static void multiplication(float[] workArray, float... secondNumber) {
        for (int i = 0; i < workArray.length; i++) {
            for(float f : secondNumber) {
                workArray[i] *= f;
            }
        }
    }

    public static void division(float[] workArray, float... secondNumber) {
        for (int i = 0; i < workArray.length; i++) {
            for(float f : secondNumber) {
                assert (f != 0);
                workArray[i] /= f;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter N: ");
        int n = scanner.nextInt();
        assert (n > 0);
        float[] workArray = new float[n];
        for(int i = 0; i < workArray.length; i++) {
            workArray[i] = (float)((Math.random() - 0.5) * 10000);
        }
        System.out.println("Generated array is:");
        System.out.println(Arrays.toString(workArray));
        System.out.println();
        System.out.println("Please enter operator (+, -, * or /):");
        char p = scanner.next().charAt(0);
        switch (p) {
            case '+':
                addition(workArray, 1, 2, 3, 4, 5, 6, 7, 8, 9);
                break;

            case '-':
               substraction(workArray, 1, 2, 3, 4, 5, 6, 7, 8, 9);
                break;

            case '*':
                multiplication(workArray, 1, 2, 3, 4, 5, 6, 7, 8, 9);
                break;

            case '/':
                division(workArray, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
                break;

            default:
                System.out.println("You entered incorrect operator;");
                break;
        }
        assert ((p == '+') || (p == '-') || (p == '*') || (p == '/'));
        System.out.println("Result array is: ");
        System.out.println(Arrays.toString(workArray));
    }
}
