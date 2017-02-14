package ua.itea.javabasic.practice.lesson06.timestablestaticclass;
public class OutputResultRandomTable {
    public static void showResultRandomTable(String[] result) {
        System.out.println("Please solve:");
        for (int i = 0; i < result.length; i++) {
            System.out.println((i + 1) + ") " + result[i]);
        }
    }
}
