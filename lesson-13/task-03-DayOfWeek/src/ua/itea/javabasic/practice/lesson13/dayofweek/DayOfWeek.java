//D
package ua.itea.javabasic.practice.lesson13.dayofweek;
enum DayOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    public static void main(String[] args) {
        if (args.length == 1) {
            DayOfWeek day;
            switch (Integer.parseInt(args[0])) {
                case 1:
                    day = DayOfWeek.SUNDAY;
                    System.out.println("This day is: " + day + ";");
                    break;
                case 2:
                    day = DayOfWeek.MONDAY;
                    System.out.println("This day is: " + day + ";");
                    break;
                case 3:
                    day = DayOfWeek.TUESDAY;
                    System.out.println("This day is: " + day + ";");
                    break;
                case 4:
                    day = DayOfWeek.WEDNESDAY;
                    System.out.println("This day is: " + day + ";");
                    break;
                case 5:
                    day = DayOfWeek.THURSDAY;
                    System.out.println("This day is: " + day + ";");
                    break;
                case 6:
                    day = DayOfWeek.FRIDAY;
                    System.out.println("This day is: " + day + ";");
                    break;
                case 7:
                    day = DayOfWeek.SATURDAY;
                    System.out.println("This day is: " + day + ";");
                    break;
                default:
                    System.out.println("You entered incorrect number.");
                    System.out.println("Please enter number day of week (integer type, from 1 to 7).");
                    break;
            }
        }
        else {
            System.out.println("You entered incorrect number.");
            System.out.println("Please enter number day of week (integer type, from 1 to 7).");
        }
    }
}