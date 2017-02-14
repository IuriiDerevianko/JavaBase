//D
package ua.itea.javabasic.practice.lesson04.modulus;
public class Main {
    public static void main(String[] args) {
        int variable = Integer.parseInt(args[0]);
        if((variable%2)==0) {
            System.out.println("This argument ( " + variable + " ) is even;");
        }
        else {
            System.out.println("This argument ( " + variable + " ) is odd;");
        }
    }
}
