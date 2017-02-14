//D
package ua.itea.javabasic.practice.lesson04.calc;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        String mainString = "3+2*10-20/3";  //10;
        System.out.println("You entered: " + mainString + ";");
        char[] charArray = mainString.toCharArray();
        //System.out.println(Arrays.toString(charArray));

        int counterOperator = 0;
        for (int i = 0; i < charArray.length; i++) {
            if ((charArray[i] == '+')||(charArray[i] == '-')||(charArray[i] == '*')||(charArray[i] == '/')) {
                counterOperator++;
            }
        }

        char[] operatorArray = new char[counterOperator];
        int j = 0;
        for (int i = 0; i < charArray.length; i++) {
            if((charArray[i] == '+')||(charArray[i] == '-')||(charArray[i] == '*')||(charArray[i] == '/')) {
                operatorArray[j] = charArray[i];
                j++;
            }
        }
        //System.out.println(Arrays.toString(operatorArray));

        int[] numberArray = new int[counterOperator+1];
        String tempNumber = "";
        j = 0;
        for (int i = 0; i < charArray.length; i++) {
            if((charArray[i] != '+')&&(charArray[i] != '-')&&(charArray[i] != '*')&&(charArray[i] != '/')) {
                tempNumber += charArray[i];
            }
            else {
                numberArray[j] = Integer.parseInt(tempNumber);
                tempNumber = "";
                j++;
            }
            if(i==(charArray.length-1)) {
                numberArray[j] = Integer.parseInt(tempNumber);
                tempNumber = "";
            }
        }
        //System.out.println(Arrays.toString(numberArray));

        int result = numberArray[0];
        j = 0;
        for (int i = 1; i < numberArray.length; i++, j++) {
            if(operatorArray[j] == '+') {
                result += numberArray[i];
            }
            if(operatorArray[j] == '-') {
                result -= numberArray[i];
            }
            if(operatorArray[j] == '*') {
                result *= numberArray[i];
            }
            if(operatorArray[j] == '/') {
                result /= numberArray[i];
            }
        }
        System.out.println("Result is: " + result + ";");
    }
}
