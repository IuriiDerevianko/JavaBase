//D
package ua.itea.javabasic.practice.lesson04.cycles;
public class Main {
    public static void main(String[] args) {
        int variables = Integer.parseInt(args[0]);
        //a);
        System.out.println("a) args[0] = " + args[0] + " ;");
        System.out.println("\tfor: ");
        for (int i = 1; i <= variables ; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();
        System.out.println("\twhile: ");
        int first_count = 1;
        while(first_count <= variables) {
            System.out.print("\t" + first_count);
            first_count++;
        }

        //b);
        System.out.println();
        System.out.println("b) args[0] = " + args[0] + " ;");
        System.out.println("\tfor: ");
        for (int i = 3; i <= variables ; i+=3) {
            System.out.print("\t" + i);
        }
        System.out.println();
        System.out.println("\twhile: ");
        int second_count = 3;
        while(second_count <= variables) {
            System.out.print("\t" + second_count);
            second_count+=3;
        }
    }
}
