//D
package ua.itea.javabasic.practice.lesson05.cw_01;
import  java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter number (N!, int type): ");
        String sn = reader.readLine();
        int n = Integer.parseInt(sn);
        int res = 0;
        for(int i = n; i > 0; i--){
            res += i;
        }
        System.out.println("Result is: (" + n + "!): " + res + " ;");
    }
}
