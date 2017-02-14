//D
package ua.itea.javabasic.practice.lesson08.circles;
public class Main {
    public static void main(String[] args) {

        Circle firstCircle = new Circle();
        System.out.println("1) r1 = " + firstCircle.getR() + ";");
        System.out.println("\tfirstCircle.area() =" + firstCircle.area() + ";");
        Circle secondCircle = new Circle(2);
        System.out.println("2) r2 = " +  secondCircle.getR() + ";");
        System.out.println("\tsecondCircle.area() =" + secondCircle.area() + ";");
        Circle thirdCircle = Circle.combine(firstCircle, secondCircle);
        System.out.println("3) r3 = (r1+r2) = " +  thirdCircle.getR() + ";");
        System.out.println("\tfirstCircle.area() =" + thirdCircle.area() + ";");
        System.out.println("counter = " + Circle.counter + ";");
    }
}
