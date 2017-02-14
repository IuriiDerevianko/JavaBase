//D
package ua.itea.javabasic.practice.lesson14.myexception;
public class Main {
     int i;

    public Main(int i) throws MyException {
        if(i < 0) {
            throw new MyException("Negative value;");
        }
        this.i = i;
    }

    public static void main(String[] args) {
        try {
            Main main = new Main(10);
            System.out.println("Main created;");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally worked;");
        }
    }
}
