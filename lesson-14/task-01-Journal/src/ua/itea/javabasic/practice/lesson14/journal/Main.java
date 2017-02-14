//D
package ua.itea.javabasic.practice.lesson14.journal;
        import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.Scanner;

public class Main {
    private static final Register reg = new Register();

    // initial database
    static {
        try {
            reg.add(new Person("Iurii", "Derevianko", new Date(translateYear(1991), translateDay(3), 23)));
        } catch(IllegalNameException e) {
            System.err.println(e.getMessage());
        } catch(IllegalDateException e) {
            System.err.println(e.getMessage());
        }

        try {
            reg.add(new Person("James", "Gosling", new Date(translateYear(1955), translateDay(5), 19)));
        } catch(IllegalNameException e) {
            System.err.println(e.getMessage());
        } catch(IllegalDateException e) {
            System.err.println(e.getMessage());
        }

        try {
            reg.add(new Person("Linus", "Torvalds", new Date(translateYear(1969), translateDay(11), 28)));
        } catch(IllegalNameException e) {
            System.err.println(e.getMessage());
        } catch(IllegalDateException e) {
            System.err.println(e.getMessage());
        }
    }

    private static int translateYear(int year) throws IllegalDateException {
        if((year > 2017)||(year < 1900)) {
            throw new IllegalDateException("Illegal date;");
        }
        return year - 1900;
    }

    private static int translateDay(int day) throws IllegalDateException {
        if((day > 12)||(day < 1)) {
            throw new IllegalDateException("Illegal date;");
        }
        return day - 1;
    }

    private static String translateDate(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        return format.format(date);
    }

    public static void main(String[] args) throws Exception {
        Date birthdate;
        int n, choose, deleteIndex, addYear, addMonth, addDay;
        String searchSurname, addName, addSurname;

        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Welcome to the Journal!");
        do {
            choose = 0;
            System.out.println(" Please choose action (enter number): ");
            System.out.println("\t1) Show the journal;");
            System.out.println("\t2) Add a student;");
            System.out.println("\t3) Find a student;");
            System.out.println("\t4) Remove a student;");
            System.out.println("\t5) Exit;");
            System.out.println("-------------------------------------------------");

            choose = scanner.nextInt();
            switch(choose) {
                case 1:
                    System.out.println("1) Show the journal mode:");
                    System.out.println();
                    for (int i = 0; i < reg.getLength(); i++) {
                        System.out.println("Index is: " + i + ";");
                        System.out.println(reg.get(i).getName() + " " + reg.get(i).getSurname() + ";");
                        birthdate = reg.get(i).getBirth();
                        System.out.println(translateDate(birthdate) + ";");
                        System.out.println();
                    }
                    System.out.println("=================================================");
                    System.out.println();
                    break;

                case 2:
                    System.out.println("2) Add a student mode:");
                    System.out.println("Please enter Name (Xxxx):");
                    addName = reader.readLine();
                    System.out.println("Please enter Surname (Xxxxxx):");
                    addSurname = reader.readLine();
                    System.out.println("Please enter year of Birth (YYYY):");
                    addYear = scanner.nextInt();
                    System.out.println("Please enter month of Birth (MM):");
                    addMonth = scanner.nextInt();
                    System.out.println("Please enter day of Birth (DD):");
                    addDay = scanner.nextInt();
                    try {
                        reg.add(new Person(addName, addSurname, new Date(translateYear(addYear), translateDay(addMonth), addDay)));
                        System.out.println("The student added;");
                    } catch (IllegalNameException e) {
                        System.err.println(e.getMessage());
                    } catch (IllegalDateException e) {
                        System.err.println(e.getMessage());
                    }
                    System.out.println("=================================================");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("3) Find a student mode:");
                    System.out.println("Please enter surname:");
                    searchSurname = reader.readLine();
                    System.out.println();
                    n = reg.indexBySurname(searchSurname);
                    System.out.println("Index is: " + n + ";");
                    if(n != -1) {
                        System.out.println(reg.get(n).getName() + " " + reg.get(n).getSurname() + ";");
                        birthdate = reg.get(n).getBirth();
                        System.out.println(translateDate(birthdate) + ";");
                        System.out.println();
                    }
                    else {
                        System.out.println("Isn't found;");
                        System.out.println();
                    }
                    System.out.println("=================================================");
                    System.out.println();
                    break;

                case 4:
                    System.out.println("4) Remove a student mode:");
                    System.out.println("Please enter index student which you want to delete:");
                    deleteIndex = scanner.nextInt();
                    reg.delete(deleteIndex);
                    System.out.println("Student with index " + deleteIndex + " removed;");
                    System.out.println("=================================================");
                    System.out.println();
                    break;

                case 5:
                    System.out.println("5) Exit mode:");
                    System.out.println("Goodbye;");
                    System.out.println("=================================================");
                    System.out.println();
                    break;

                default:
                    System.out.println("You choose incorrect action (incorrect number);");
                    System.out.println("Please try again!");
                    System.out.println("=================================================");
                    System.out.println();
                    break;
            }
        }
        while(choose != 5);
    }
}



