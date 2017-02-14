//D
package ua.itea.javabasic.practice.lesson06.proximalwithclasses;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter coordinate (integer type) A = ");
        Point pointA = new Point(scanner.nextInt());
        System.out.print("Please enter coordinate (integer type) B = ");
        Point pointB = new Point(scanner.nextInt());
        Point pointC = new Point(6);
        if(pointA.x!=pointB.x) {
            if ((Math.abs(pointB.x-pointC.x))>(Math.abs(pointA.x-pointC.x))) {
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
