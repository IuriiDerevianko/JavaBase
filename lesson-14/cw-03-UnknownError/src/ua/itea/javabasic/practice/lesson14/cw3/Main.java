package ua.itea.javabasic.practice.lesson14.cw3;

public class Main {
    public static void main(String[] args) {
        int d = 3;
        try {
            int[] array = new int[d - 1];
            array[0] = 100 / --d;
            array[1] = 200 / --d;
            array[2] = 300 / --d;

        } catch (ArrayIndexOutOfBoundsException|ArithmeticException ex) {
            System.out.println("Произошла неизвестная ошибка.");
            System.out.println("Приложение будет закрыто, приносим извинения.");
            //System.exit(1);
        } finally {
            System.out.println("cleaning up...");
        }

        /* catch (ArithmeticException ex) {
            System.out.println("Ошибка деления на ноль;");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Выход за пределы массива");
        }*/
    }
}
