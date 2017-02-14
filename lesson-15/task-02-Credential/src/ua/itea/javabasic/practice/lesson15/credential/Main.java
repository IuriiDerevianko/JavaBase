//D
package ua.itea.javabasic.practice.lesson15.credential;
public class Main {

    public static void main(String[] args) {

        //1.
        FirstCredential objFirst = new FirstCredential();
        char[] ch = {'q', 'w', 'e', 'r', 't', 'y'};
        objFirst.setLogin(ch);
        Byte b = 124;
        objFirst.setPin(b);

        //2.
        SecondCredential objSecond = new SecondCredential();
        objSecond.setLogin("qwertyu".toCharArray());
        objSecond.setPin(125);


        //3.
        ThirdCredential<char[], Byte> c = new ThirdCredential<>();

        char[] login = "Iurii".toCharArray();
        Byte pin = 123;

        c.setLogin(login);
        c.setPin(pin);
    }
}