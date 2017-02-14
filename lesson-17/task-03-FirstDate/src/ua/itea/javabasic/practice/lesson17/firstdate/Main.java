//D
package ua.itea.javabasic.practice.lesson17.firstdate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Date nowDate = new Date();
        System.out.println("Now is: " + nowDate + ";");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter date (yyyy, MM, dd):");
        final String format = "yyyy, MM, dd";
        final String date;
        date = scanner.nextLine();
        Date enterDate;
        try {
            enterDate = new SimpleDateFormat(format).parse(date);

            System.out.println("\nYou entered: " + enterDate + ";");
            if(enterDate.getYear() != nowDate.getYear()){
                System.out.println("\nYears inequality: " + (enterDate.getYear() + 1900) + " != " + (nowDate.getYear() + 1900) + ";");
            }
            if(enterDate.getMonth() != nowDate.getMonth()){
                System.out.println("Months inequality: " + (enterDate.getMonth() + 1) + " != " + (nowDate.getMonth() + 1) + ";");
            }
            if(enterDate.getDate() != nowDate.getDate()){
                System.out.println("Dates inequality: " + enterDate.getDate() + " != " + nowDate.getDate() + ";");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
