package ua.itea.javabasic.practice.lesson06.timestablestaticclass;
public class CreaterResultRandomTable {
    static String[] result;

    public static void createResultRandomTable(int[] firstNumberRandom, int[] secondNumberRandom) {
        result = new String[15];
        for (int i = 0; i < result.length; i++) {
            result[i] = firstNumberRandom[i] + " * " + secondNumberRandom[i] + " = ___;";
        }
    }
}
