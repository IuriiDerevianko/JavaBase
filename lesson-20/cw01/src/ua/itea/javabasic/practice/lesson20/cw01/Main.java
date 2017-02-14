package ua.itea.javabasic.practice.lesson20.cw01;
public class Main {
    public static void main(String[] args) {

        int lengthArray = 2;
        DynamicArray array = new DynamicArray(lengthArray);

        System.out.println("array[0] = " + array.get(0) + ";");
        System.out.println();

        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, null);
        //array.set(-1, 5);    //IndexOutOfBoundsException;

        System.out.println("array[0] = " + array.get(0) + ";");
        System.out.println("array[1] = " + array.get(1) + ";");
        System.out.println("array[2] = " + array.get(2) + ";");
        System.out.println("array[3] = " + array.get(3) + ";");
        System.out.println("array[4] = " + array.get(4) + ";");
        //System.out.println("array[5] = " + array.get(5) + ";");    //IndexOutOfBoundsException;
        System.out.println();

        System.out.println("Size of the array is: " + array.size() + ";");


        for (int i = 0; i < 100; i++) {
            array.set(i, 10);
        }

        for (int i = 0; i < 100; i++) {
            System.out.println("array[" + i + "] = " + array.get(i) + ";");
        }

        MyThread t = new MyThread(array);
        t.start();
    }
}
