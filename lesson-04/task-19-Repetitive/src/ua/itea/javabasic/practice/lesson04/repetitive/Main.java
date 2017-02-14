//D
package ua.itea.javabasic.practice.lesson04.repetitive;
public class Main {
    public static void main(String[] args) {
        int[] mainArray = {4,5,7,4,8,5,6,5,1,1,1,1,1,1};
        int index = 0;
        int tempIndex = 0;
        int counter = 0;
        int tempCounter = 0;

        for (int i = 0; i < mainArray.length; i++) {
            if (mainArray[0] == mainArray[i]) {
                counter++;
            }
        }

        for (int i = 0; i < mainArray.length; i++) {
            for (int j = 0; j < mainArray.length; j++) {
                if(mainArray[i] == mainArray[j]) {
                    tempCounter++;
                    tempIndex = j;
                }
            }
            if (tempCounter > counter) {
                index = tempIndex;
                counter = tempCounter;
                tempCounter = 0;
                tempIndex = 0;
            }
        }
        System.out.println("Result is: " + mainArray[index] + ";");
    }
}
