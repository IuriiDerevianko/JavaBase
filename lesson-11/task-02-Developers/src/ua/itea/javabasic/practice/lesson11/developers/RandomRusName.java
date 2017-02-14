package ua.itea.javabasic.practice.lesson11.developers;
/**
 * Генератор русского имени
 *
 * в месте где нужно создать имя
 * вставить RandomRusName.RndRusName()
 */
public class RandomRusName {
    //русские буквы(31);  первые 10 - гласные; 10-31 - согласные;
    private static char[] bykvu = "ауоыиэяюёебвгджзйклмнпрстфхцчшщ".toCharArray();

    static int rndGlasnoi(){                                        //random гласной
        return (int) Math.round(10*Math.random());
    }

    static int rndSoglasnoi(){                                      //random согласной
        return (int) (11 + Math.round(19*Math.random()));
    }

    //random имени
    static String RndRusName(){
        String name = "";
        int[] nomer_bykvu = new int[(int)(3 + Math.random()*12)];   //длина имени 3-15 символов
        nomer_bykvu[0]= (int)(Math.random()*30);                    //первая буква имени

        for (int i = 1; i <nomer_bykvu.length ; i++) {
            if(nomer_bykvu[i-1] <=10)                               //запрещаем повтор гласных и согласных
                nomer_bykvu[i]=rndSoglasnoi();
            else
                nomer_bykvu[i] = rndGlasnoi();
        }

        name += Character.toUpperCase(bykvu[nomer_bykvu[0]]);       //первая буква с верхним регистром
        for (int i = 1; i < nomer_bykvu.length ; i++) {
            name += (bykvu[nomer_bykvu[i]]);
        }
        return name;
    }
}
