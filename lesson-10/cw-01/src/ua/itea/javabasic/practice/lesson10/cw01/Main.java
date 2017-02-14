package ua.itea.javabasic.practice.lesson10.cw01;
public class Main {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.method3();

        Child c = new Child();
        c.method1();    //OK
        c.method2();    //OK
        c.method3();    //OK

    }
}
