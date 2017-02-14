//D
package ua.itea.javabasic.practice.lesson17.seconddate;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        Date nowDate = new Date();
        System.out.println("Now is: " + nowDate + ";");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Birthday date (yyyy, MM, dd):");
        final String format = "yyyy, MM, dd";
        final String date;
        date = scanner.nextLine();
        Date enterDate;
        try {
            enterDate = new SimpleDateFormat(format).parse(date);
            System.out.println("\nYou entered: " + enterDate + ";");
            if((nowDate.getMonth() > enterDate.getMonth()) ||
                    ((nowDate.getMonth() == enterDate.getMonth()) && (nowDate.getDate() > enterDate.getDate()))) {
                Date nextBirthday = new Date((nowDate.getYear() + 1), enterDate.getMonth(), enterDate.getDate());
                System.out.println("Until the next birthday remains " +
                        (TimeUnit.MILLISECONDS.toDays(nextBirthday.getTime() - nowDate.getTime())) + " days;");
                System.out.println("You will be in " + (nextBirthday.getYear() - enterDate.getYear()) + " years;");
            }

            if((nowDate.getMonth() < enterDate.getMonth()) ||
                    ((nowDate.getMonth() == enterDate.getMonth()) && (nowDate.getDate() < enterDate.getDate()))) {
                Date nextBirthday = new Date(nowDate.getYear(), enterDate.getMonth(), enterDate.getDate());
                System.out.println("Until the next birthday remains " +
                        (TimeUnit.MILLISECONDS.toDays(nextBirthday.getTime() - nowDate.getTime())) + " days;");
                System.out.println("You will be in " + (nextBirthday.getYear() - enterDate.getYear()) + " years;");
            }

            if((nowDate.getMonth() == enterDate.getMonth()) && (nowDate.getDate() == enterDate.getDate())) {
                System.out.println("Happy Birthday! You " + (nowDate.getYear() - enterDate.getYear()) + " years!");
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("\nRuntime is: " + estimatedTime + " ns;");
    }
}
