//D
package ua.itea.javabasic.practice.lesson03.stringanalyzer;
public class Main {
    public static void main(String[] args) {
        String mainString = args[0];
        System.out.println("You entered string:");
        System.out.println(mainString + ";");
        System.out.println();
        //a)
        String mainStringFirstReplase = mainString.replace("a", "bcd");
        String mainStringSecondReplase = mainStringFirstReplase.replace("A", "a");
        System.out.println("Result:");
        System.out.println("a) " + mainStringSecondReplase + ";");
        //b)
        System.out.println("b) " + mainString.length() + ";");
        //c)
        String firstString = mainString.substring(0, (mainString.length()/2));
        String secondString = mainString.substring((mainString.length()/2), mainString.length());
        System.out.println("c) " + secondString + firstString + ";");
    }
}
