//D
package ua.itea.javabasic.practice.lesson03.revers_3_numb;
public class Main {
    public static void main(String[] args) {
        System.out.println("You entered number: " + args[0] + " ;");
        int arg = Integer.parseInt(args[0]);
        int res1 = arg/100;
        int temp = arg%100;
        int res2 = temp/10;
        int res3 = temp%10;
        int result = res1 + (res2*10) + (res3*100);
        System.out.println("Result (reverse number) is: " + result + " ;");
    }
}
