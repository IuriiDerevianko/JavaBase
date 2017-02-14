//D
package ua.itea.javabasic.practice.lesson02.read_input;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {

        //соединяемся с консолью;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //пользовательский ввод;
        String input;

        //приглашение ввода;
        System.out.print("Input a number: ");

        input = reader.readLine(); //запрос на ввод;
        System.out.println("You typed: " + input);

        //пробуем преобразовать строку в число
        int i = Integer.parseInt(input);
        System.out.println("Well, this's the integer: " + i);
    }
}