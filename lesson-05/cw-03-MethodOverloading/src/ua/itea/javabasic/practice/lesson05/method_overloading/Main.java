//D
package ua.itea.javabasic.practice.lesson05.method_overloading;
public class Main {
    public static void main(String[] args) {
        print('$');
        print(')', 5);
    }

    public static void print(char symbol) {
        System.out.println(symbol);
    }

    public static void print(char symbol, int times) {
        for(int i = 0; i < times; i++) {
            System.out.println(symbol);
        }
    }
}
