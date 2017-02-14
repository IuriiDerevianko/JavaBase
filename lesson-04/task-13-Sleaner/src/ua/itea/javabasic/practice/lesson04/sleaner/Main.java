//D
package ua.itea.javabasic.practice.lesson04.sleaner;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s%n", "Please enter string with two $ sign (...$.. ..$...):");
        String stringBefore = scanner.nextLine();
        //String stringBefore = " 123 $456 789\t0  123$ 456 ";
        System.out.printf("%s%n", "Your string is:");
        System.out.printf("%s%n", stringBefore);
        char[] charArrayBefore = stringBefore.toCharArray();
        int index = 0;
        int indexFirstSign = 0;
        int indexSecondSign = 0;
        int indexTemp = 0;
        String stringAfter = "";

        while (index < charArrayBefore.length) {
            if((charArrayBefore[index]=='$')&&(indexTemp!=0)) {
                indexFirstSign = indexTemp;
                indexSecondSign = index;
            }
            if(charArrayBefore[index]=='$') {
                indexTemp = index;
            }
            index++;
        }

        index = 0;
        while(index < indexFirstSign) {
            stringAfter+=charArrayBefore[index];
            index++;
        }

        index = indexFirstSign;
        while(index <= indexSecondSign) {
            if((charArrayBefore[index]!=' ')&&(charArrayBefore[index]!='\t')) {
                stringAfter+=charArrayBefore[index];
            }
            index++;
        }

        index = (indexSecondSign + 1);
        while(index < charArrayBefore.length) {
            stringAfter+=charArrayBefore[index];
            index++;
        }
        System.out.printf("%s%n", "Result is:");
        System.out.printf("%s%n", stringAfter);
    }
}
