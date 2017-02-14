//D
package ua.itea.javabasic.practice.lesson04.sum;
public class Main {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i = 1; i < (array.length - 1); i++) {
            sum += array[i];
        }
        System.out.println("Result is:" + sum + ";");
    }
}
