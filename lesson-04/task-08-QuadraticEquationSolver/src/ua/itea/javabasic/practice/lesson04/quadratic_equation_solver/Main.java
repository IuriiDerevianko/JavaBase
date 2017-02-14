//D
package ua.itea.javabasic.practice.lesson04.quadratic_equation_solver;
public class Main {
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double c = 1;
        System.out.println("Your quadratic equation: " + a + "x^2 + " + b + "x + " + c + " = 0;");
        double d = ((b*b) - (4*a*c));
        if(d < 0) {
            System.out.println("Quadratic equation have not solutions;");
        }
        else {
            if(d == 0) {
                double x1 = (-(b/(2*a)));
                double x2 = (-(b/(2*a)));
                System.out.println("x1= " + x1 + ";");
                System.out.println("x2= " + x2 + ";");
            }
            else {
                double x1 = ((-b+Math.sqrt(d))/(2*a));
                double x2 = ((-b-Math.sqrt(d))/(2*a));
                System.out.println("x1= " + x1 + ";");
                System.out.println("x2= " + x2 + ";");
            }
        }
    }
}
