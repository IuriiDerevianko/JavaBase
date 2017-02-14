//D
package ua.itea.javabasic.practice.lesson04.proximal;
import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter coordinate (integer type) A = ");
        int a = scanner.nextInt();
        System.out.print("Please enter coordinate (integer type) B = ");
        int b = scanner.nextInt();
        int c = 6;
        if(a!=b) {
            if ((abs(b-c))>(abs(a-c))) {
                System.out.println("Point A is nearer to C;");
            }
            else{
                System.out.println("Point B is nearer to C;");
            }
        }
        else {
            System.out.println("Point A and B at the same distance;");
        }

    }
}
