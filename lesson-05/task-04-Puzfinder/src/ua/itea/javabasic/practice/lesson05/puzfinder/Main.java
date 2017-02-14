//D
package ua.itea.javabasic.practice.lesson05.puzfinder;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static char[][] randomCharArrayCreate(int n) {
        char[][] charArray = new char[n][n];
        char[] alphabetArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int randomN = random.nextInt(alphabetArray.length);
                charArray[i][j] = alphabetArray[randomN];
            }
        }
        return charArray;
    }

    public static void searchHorizontal(char[][] charArray, String word){
        char[] charArrayWord = word.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                int l = 0;
                if(charArray[i][j] == charArrayWord[l]) {
                    int startI = i, startJ = j, counter = 0;
                    for (int k = j ; ((k < charArray.length)&&(l < charArrayWord.length)); k++, l++) {
                        if (charArray[i][k] == charArrayWord[l]) {
                            counter++;
                            if (counter == charArrayWord.length) {
                                System.out.println("Word is found in HORIZONTAL:");
                                System.out.println("Start of word charArray[" + startI + "][" + startJ + "];");
                                System.out.println();
                                break;
                            }
                        }
                        else {
                            break;
                        }
                    }
                }
            }
        }
    }


    public static void searchVertical(char[][] charArray, String word){
        char[] charArrayWord = word.toCharArray();
        for (int j = 0; j < charArray.length; j++) {
            for (int i = 0; i < charArray.length; i++) {
                int l = 0;
                if(charArray[i][j] == charArrayWord[l]) {
                    int startI = i, startJ = j, counter = 0;
                    for (int k = i ; ((k < charArray.length)&&(l < charArrayWord.length)); k++, l++) {
                        if (charArray[k][j] == charArrayWord[l]) {
                            counter++;
                            if (counter == charArrayWord.length) {
                                System.out.println("Word is found in VERTICAL:");
                                System.out.println("Start of word charArray[" + startI + "][" + startJ + "];");
                                System.out.println();
                                break;
                            }
                        }
                        else {
                            break;
                        }
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter size array charArray[n][n] (integer type):");
        System.out.print("\tn = ");
        if(sc.hasNextInt()) {
            n = sc.nextInt();
        }
        else {
            System.out.println("This number isn't integer type;");
        }

        char[][] charArray = randomCharArrayCreate(n);
        System.out.println("Creates array is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print("  " + charArray[i][j]);
            }
            System.out.println();
        }

        System.out.println("Please enter a search word:");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        searchHorizontal(charArray, word);
        searchVertical(charArray, word);
    }
}
