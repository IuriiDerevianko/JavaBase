//D
package ua.itea.javabasic.practice.lesson13.developerssecond;
public class Main {
    public static void main(String[] args) {
        Developer[] list = {
                new JuniorDeveloper("Mike", 500, 0),
                new JuniorDeveloper("Dima", 500, 1),
                new JuniorDeveloper("Vova", 500, 2),
                new SeniorDeveloper("Jack", 500, 5),
                new TeamLeadDeveloper("Robby", 500, 7),
                new Architect("Iurii", 500, 11)
        };

        StringBuilder sb;
        for (Developer d : list) {
            sb = new StringBuilder()
                    .append(d.getName())
                    .append(":")
                    .append(d.getBasicSalary())
                    .append(" -> ")
                    .append(d.getSalary());
            System.out.println(sb.toString());
        }

        System.out.println("-----------------------------------------------------------------------");

        //2.
        Developer[] workArray = new Developer[50];
        for (int i = 0; i < workArray.length; i++) {
            workArray[i] = RandomDeveloper.newRandomDeveloper((int)(Math.round(Math.random() * 3)));
        }

        for (Developer d : workArray) {
            if((d.getClass().getSimpleName().equals("SeniorDeveloper"))&&(d.getSalary() >= 1500)) {
                sb = new StringBuilder()
                        .append(d.getName())
                        .append(":")
                        .append(d.getBasicSalary())
                        .append(" -> ")
                        .append(d.getSalary());
                System.out.println(sb.toString());
            }
        }

        System.out.println("-----------------------------------------------------------------------");

        //3.
        int counter = 0;
        for (Developer d : workArray) {
            if(d.getClass().getSimpleName().equals("JuniorDeveloper")) {
                counter++;
            }
        }

        System.out.println(counter + " JuniorDevelopers;");
        Developer[] juniorArray = new Developer[counter];
        int j = 0;
        for (int i = 0; i < workArray.length; i++) {
            if(workArray[i].getClass().getSimpleName().equals("JuniorDeveloper")) {
                juniorArray[j] = workArray[i];
                j++;
            }
        }

        for (Developer d : juniorArray) {
            sb = new StringBuilder()
                    .append(d.getName())
                    .append(":")
                    .append(d.getBasicSalary())
                    .append(" -> ")
                    .append(d.getSalary());
            System.out.println(sb.toString());
        }
        for (Developer d : juniorArray) {
            System.out.println(d);
        }
        System.out.println();


        counter = 0;
        for (Developer d : workArray) {
            if(d.getClass().getSimpleName().equals("SeniorDeveloper")) {
                counter++;
            }
        }

        System.out.println(counter + " SeniorDevelopers;");
        Developer[] seniorArray = new Developer[counter];
        j = 0;
        for (int i = 0; i < workArray.length; i++) {
            if(workArray[i].getClass().getSimpleName().equals("SeniorDeveloper")) {
                seniorArray[j] = workArray[i];
                j++;
            }
        }

        for (Developer d : seniorArray) {
            sb = new StringBuilder()
                    .append(d.getName())
                    .append(":")
                    .append(d.getBasicSalary())
                    .append(" -> ")
                    .append(d.getSalary());
            System.out.println(sb.toString());
        }
        for (Developer d : seniorArray) {
            System.out.println(d);
        }
        System.out.println();


        counter = 0;
        for (Developer d : workArray) {
            if(d.getClass().getSimpleName().equals("TeamLeadDeveloper")) {
                counter++;
            }
        }

        System.out.println(counter + " TeamLeadDevelopers;");
        Developer[] teamLeadArray = new Developer[counter];
        j = 0;
        for (int i = 0; i < workArray.length; i++) {
            if(workArray[i].getClass().getSimpleName().equals("TeamLeadDeveloper")) {
                teamLeadArray[j] = workArray[i];
                j++;
            }
        }

        for (Developer d : teamLeadArray) {
            sb = new StringBuilder()
                    .append(d.getName())
                    .append(":")
                    .append(d.getBasicSalary())
                    .append(" -> ")
                    .append(d.getSalary());
            System.out.println(sb.toString());
        }
        for (Developer d : teamLeadArray) {
            System.out.println(d);
        }
        System.out.println();


        counter = 0;
        for (Developer d : workArray) {
            if(d.getClass().getSimpleName().equals("Architect")) {
                counter++;
            }
        }

        System.out.println(counter + " Architects;");
        Developer[] architectArray = new Developer[counter];
        j = 0;
        for (int i = 0; i < workArray.length; i++) {
            if(workArray[i].getClass().getSimpleName().equals("Architect")) {
                architectArray[j] = workArray[i];
                j++;
            }
        }

        for (Developer d : architectArray) {
            sb = new StringBuilder()
                    .append(d.getName())
                    .append(":")
                    .append(d.getBasicSalary())
                    .append(" -> ")
                    .append(d.getSalary());
            System.out.println(sb.toString());
        }
        for (Developer d : architectArray) {
            System.out.println(d);
        }
        System.out.println();
    }
}
