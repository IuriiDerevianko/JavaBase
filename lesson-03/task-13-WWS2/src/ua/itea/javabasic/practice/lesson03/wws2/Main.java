//D
package ua.itea.javabasic.practice.lesson03.wws2;
public class Main {
    public static void main(String[] args) {
        String mainString = "1)ITEA2)Love3)Java";
        System.out.println("You entered string: ");
        System.out.println(mainString + ";");
        System.out.println();
        String firstString = mainString.substring(0, 6);
        String secondString = mainString.substring(6, 12);
        String thirdString = mainString.substring(12, 18);
        System.out.println("Result is: ");
        //a) 2nd,3rd,1st;
        System.out.println("a) " + secondString + thirdString + firstString + ";");
        //b) 2nd,1st,3rd;
        System.out.println("b) " + secondString + firstString + thirdString + ";");
    }
}
