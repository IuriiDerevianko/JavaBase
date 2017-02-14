package ua.itea.javabasic.practice.lesson06.calcs_static;
import java.io.*;
public class Main {
    static double res;

    public static void add(double a, double b) {
        res = (a + b);
    }
    public static void sub(double a, double b) {
        res = (a - b);
    }
    public static void mul(double a, double b) {
        res = (a * b);
    }
    public static void div(double a, double b) {
        res = (a / b);
    }
    public static void mod(double a, double b) {
        res = ((a / b)*100);
    }
    public static void sqr(double a) {
        res = (Math.sqrt(a));
    }
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter mathematical expression with operator +, -, *, /, %, sqr (variables double type):");
        System.out.println("\tfor example: A.AA+B.BB, A.AA%B.BB, sqrA.AA, ect; ");
        String mainString = reader.readLine();
        //String mainString = "12%3";
        //String mainString = "sqr4";
        char[] charArray = mainString.toCharArray();
        //System.out.println(Arrays.toString(charArray));
        String firstArg = "", secondArg = "", operator = "";
        int operatorIndex = 0;
        for (int i = 0; i < charArray.length; i++) {
            if((charArray[i]!='1')&&(charArray[i]!='2')&&(charArray[i]!='3')&&(charArray[i]!='4')
                    &&(charArray[i]!='5')&&(charArray[i]!='6')&&(charArray[i]!='7')&&(charArray[i]!='8')
                    &&(charArray[i]!='9')&&(charArray[i]!='0')&&(charArray[i]!='.')) {
                operator += charArray[i];
                operatorIndex = i;
            }
        }
        for (int i = 0; i < operatorIndex; i++) {
            if((charArray[i]=='1')||(charArray[i]=='2')||(charArray[i]=='3')||(charArray[i]=='4')
                    ||(charArray[i]=='5')||(charArray[i]=='6')||(charArray[i]=='7')||(charArray[i]=='8')
                    ||(charArray[i]=='9')||(charArray[i]=='0')||(charArray[i]=='.')) {
                firstArg += charArray[i];
            }
        }
        for (int i = operatorIndex; i < charArray.length; i++) {
            if((charArray[i]=='1')||(charArray[i]=='2')||(charArray[i]=='3')||(charArray[i]=='4')
                    ||(charArray[i]=='5')||(charArray[i]=='6')||(charArray[i]=='7')||(charArray[i]=='8')
                    ||(charArray[i]=='9')||(charArray[i]=='0')||(charArray[i]=='.')) {
                secondArg += charArray[i];
            }
        }
        System.out.println("You entered:");
        System.out.println("\tfirstArg = " + firstArg + ";");
        System.out.println("\tooperator = " + operator + ";");
        System.out.println("\tsecondArg = " + secondArg + ";");
        double dSecondArg = Double.parseDouble(secondArg);
        if(operator.equals("sqr")) {
            sqr(dSecondArg);
            System.out.println("Result is: " + res + ";");
        }
        else {
            double dFirstArg = Double.parseDouble(firstArg);
            if(operator.equals("+")) {
                add(dFirstArg, dSecondArg);
                System.out.println("Result is: " + res + ";");
            }
            if(operator.equals("-")) {
                sub(dFirstArg, dSecondArg);
                System.out.println("Result is: " + res + ";");
            }
            if(operator.equals("*")) {
                mul(dFirstArg, dSecondArg);
                System.out.println("Result is: " + res + ";");
            }
            if(operator.equals("/")) {
                div(dFirstArg, dSecondArg);
                System.out.println("Result is: " + res + ";");
            }
            if(operator.equals("%")) {
                mod(dFirstArg, dSecondArg);
                System.out.println("Result is: " + res + ";");
            }
        }
    }
}