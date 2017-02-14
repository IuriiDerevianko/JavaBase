//D
package ua.itea.javabasic.practice.lesson03.lohica;
public class Main {
    public static void main(String[] args) {
        final boolean A = true,  B =false, C = false;
        System.out.println("A = true,  B = false, C = false:");
        //a)
        System.out.println("\ta) (A||B) = " + (A||B) + " ;");

        //b)
        System.out.println("\tb) (A&&B) = " + (A&&B) + " ;");

        //c)
        System.out.println("\tc) (B&&C) = " + (B&&C) + " ;");

        //d)
        System.out.println("\td) (!A&&B) = " + (!A&&B) + " ;");

        //e)
        System.out.println("\te) (A||!B) = " + (A||!B) + " ;");

        //f)
        System.out.println("\tf) (A||B&&C) = " + (A||B&&C) + " ;");

        //g)
        System.out.println("\tg) (A||(!(B&&C))) = " + (A||(!(B&&C))) + " ;");
    }
}
