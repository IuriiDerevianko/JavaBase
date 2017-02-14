package ua.itea.javabasic.practice.lesson13.developerssecond;
public class RandomDeveloper {

    public static Developer newRandomDeveloper(int i) {
        if (i == 0) {
            return new JuniorDeveloper(RandomRusName.RndRusName(), RandomDeveloper.randomBasicSalary(), RandomDeveloper.randomExperience());
        }

        if (i == 1) {
            return new SeniorDeveloper(RandomRusName.RndRusName(), RandomDeveloper.randomBasicSalary(), RandomDeveloper.randomExperience());
        }

        if (i == 2) {
            return new TeamLeadDeveloper(RandomRusName.RndRusName(), RandomDeveloper.randomBasicSalary(), RandomDeveloper.randomExperience());
        }

        if (i == 3) {
            return new Architect(RandomRusName.RndRusName(), RandomDeveloper.randomBasicSalary(), RandomDeveloper.randomExperience());
        }
        return null;
    }


    public static int randomExperience() {
        int randomExperience = (int)(Math.round(Math.random() * 50));
        return randomExperience;
    }

    public static int randomBasicSalary() {
        int[] salaryArray = {400, 450, 500, 550, 600, 650, 700};
        int randomSalary = salaryArray[(int)(Math.round(Math.random() * 6))];
        return randomSalary;
    }


    private static char[] letters = "aeiouybcdfghjklmnpqrstvwxz".toCharArray();//0-5 - гласные, 6-25 - согласные
    private static byte[] name;

    /* генератор случайной длины массива от 3 до 10;
    * можно сделать длину и 15 знаков, но получаются
    * очень нечитабельные имена
    */
    private static int rLength(){
        return (3 + (int)Math.round(7*Math.random()));
    }

    //генератор случайной буквы в виде цифры
    private static byte rN(){
        return (byte)Math.round(25*Math.random());
    }

    //генератор случайной гласной в виде цифры
    private static byte rV(){
        return (byte)Math.round(5*Math.random());
    }

    //генератор случайной согласной в виде цифры
    private static byte rC(){
        return (byte)(6 + Math.round(19*Math.random()));
    }

    //формирование имени
    static String randomName(){
        name = new byte[rLength()];
        name[0] = rN();
        name[1] = rN();
        while (name[0] == name[1]){ // исключение двух одинаковых букв в начале имени
            name[1] = rN();
        }
        for (int i = 2; i < name.length; i++) {
            if ((name[i-1] <= 5) && (name[i-2] <= 5)){
                name[i] = rC();
            } else if ((name[i-1] > 5) && (name[i-2] > 5)){
                name[i] = rV();
            } else {
                name[i] = rN();
            }
        }
        char[] charName = new char[name.length];
        charName[0] = Character.toUpperCase(letters[name[0]]);
        for (int i = 1; i < name.length ; i++) {
            charName[i] = (letters[name[i]]);
        }
        return new String(charName);
    }
}

