package ua.itea.javabasic.practice.lesson19.cw01;
public class Main {
    public static void main(String[] args) {
        char c = Character.MAX_VALUE;
        c+=23;
        System.out.println(c);
        int naturalDecimalNumber = 16;
        System.out.printf("0x%h;%n", naturalDecimalNumber);
        System.out.printf("%#x;%n", naturalDecimalNumber);
        System.out.printf("%#o;%n", naturalDecimalNumber);
    }
}
