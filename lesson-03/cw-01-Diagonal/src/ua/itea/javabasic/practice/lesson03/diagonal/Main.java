//D
package ua.itea.javabasic.practice.lesson03.diagonal;
public class Main {
        public static void main(String[] args) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Class work 3;  Iurii Derevianko;  Nov 4, 2016;");
            System.out.println();

            byte[][] b = new byte[][]{{0,0,0,0,1,1},{0,0,1,1,0,0},{1,1,0,0,0,0}};
            System.out.println(b[0][0]+" "+b[0][1]+" "+b[0][2]+" "+b[0][3]+" "+b[0][4]+" "+b[0][5]);
            System.out.println(b[1][0]+" "+b[1][1]+" "+b[1][2]+" "+b[1][3]+" "+b[1][4]+" "+b[1][5]);
            System.out.println(b[2][0]+" "+b[2][1]+" "+b[2][2]+" "+b[2][3]+" "+b[2][4]+" "+b[2][5]);
            System.out.println("--------------------------------------------------------------");
        }
}
