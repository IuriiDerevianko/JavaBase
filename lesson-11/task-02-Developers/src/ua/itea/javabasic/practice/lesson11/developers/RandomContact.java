package ua.itea.javabasic.practice.lesson11.developers;
/*
* ГЕНЕРАТОР СЛУЧАЙНЫХ КОНТАКТНЫХ ДАННЫХ НА ВСЕ СЛУЧАИ ЖИЗНИ
*
* Имена и фамилии:
* Создание русского имени - RandomContact.rusNameGenerate()
* Создание русского имени латиницей - RandomContact.engNameGenerate()
* Создание русской фамилии - RandomContact.rusSurNameGenerate()
* Создание русской фамилии латиницей- RandomContact.engSurNameGenerate()
*
* Номер телефона:
* В формате ХХХХХХХ. RandomContact.phoneNumberGenerate(RandomContact.phoneStyle.XXXXXXX);
* В формате ХХХ-ХХ-ХХ. RandomContact.phoneNumberGenerate(RandomContact.phoneStyle.XXX_XX_XX);
* В формате (XXX)ХХХ-ХХ-ХХ. RandomContact.phoneNumberGenerate(RandomContact.phoneStyle.index_XXX_XX_XX);
* Формат номера - String
*
* День рождения:
* В формате GregorianCalendar - RandomContact.birthDayGenerateToGC();
* В формате String (ДД-ММ-ГГГГ) - RandomContact.birthDayGenerateToString();
*
* Создание e-mail - RandomContact.eMailGenerate(<имя>,<фамилия>);
* Имя и фамилию можно вставлять на любом языке.
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

class RandomContact {

    //выбор случайного русского имени
    static String rusNameGenerate(){
        String[] names = new String[]{"Александр", //в массиве "names" 62 имени;
                "Алексей","Альберт","Анатолий","Андрей","Антон","Аркадий",
                "Арсений","Артем","Артур","Богдан","Борис","Вадим","Валентин",
                "Валерий","Василий","Виктор","Виталий","Владимир","Владислав",
                "Владлен","Всеволод","Вячеслав","Гавриил","Геннадий","Георгий",
                "Герасим","Герман","Глеб","Григорий","Даниил","Денис","Дмитрий",
                "Евгений","Егор","Иван","Илья","Константин","Леонид","Макар",
                "Максим","Матвей","Михаил","Никита","Николай","Олег","Павел",
                "Петр","Роман","Ростислав","Руслан","Святослав","Семен","Сергей",
                "Станислав","Степан","Тимофей","Федор","Эдуард","Юрий","Яков","Ярослав"};
        int i = (int)(Math.round(61*Math.random()));
        return names[i];
    }

    //генерация случайной русской фамилии
    static String rusSurNameGenerate(){
        String[] vEndings = new String[]{"енко", "ейко", "ов", "ев", "ий", "ин"};
        String[] cEndings = new String[]{"нов", "цов", "вьев", "льев", "чко", "вич"};
        char[] letters = "ауоыиэяюебвгджзклмнпрстфхцчшщ".toCharArray();//0-8 - гласные, 9-28 - согласные
        char[] firstLetters = "АУОИЭЯЮЕБВГДЖЗКЛМНПРСТФХЦЧШЩ".toCharArray();//0-7 - гласные, 8-27 - согласные
        byte[] name;

        name = new byte[rLength()];
        name[0] = rFL();
        if (name[0] <= 7){
            name[1] = rC();
        }
        else{
            name[1] = rV();
        }
        byte e = 0;
        for (int i = 2; i < name.length; i++) {
            if ((name[i-1] <= 8)){
                name[i] = rC();
                e = 0;
            } else {
                name[i] = rV();
                e = 1;
            }
        }
        char[] charName = new char[name.length];
        charName[0] = firstLetters[name[0]];
        for (int i = 1; i < name.length ; i++) {
            charName[i] = (letters[name[i]]);
        }
        String ending;
        if (e == 0){
            ending = vEndings[rEnd()];
        }
        else{
            ending = cEndings[rEnd()];
        }
        return (new String(charName))+ ending;
    }

    //генерация случайной русской фамилии латиницей
    static String engSurNameGenerate(){
        String rusSurName = rusSurNameGenerate();
        return  firstLetterUp(convertToLatin(rusSurName));
    }

    //генерация случайного русского имени латиницей
    static String engNameGenerate(){
        String rusName = rusNameGenerate();
        return  firstLetterUp(convertToLatin(rusName));
    }

    //генерация телефонного номера согласно стиля
    static String phoneNumberGenerate(int style){
        String number ="";
        switch (style){
            case 0:
                number = "" + rN() + rN() + rN() + rN() + rN() + rN() + rN();
                break;
            case 1:
                number = "" + rN() + rN() + rN() + "-" + rN() + rN() + "-" + rN() + rN();
                break;
            case 2:
                number = "(0" + rN() + rN() + ")" + rN() + rN() + rN() + "-" + rN() + rN() + "-" + rN() + rN();
                break;
        }
        return number;
    }

    //определения стиля вывода телефонного номера
    interface phoneStyle {
        int SIMPLE = 0;
        int XXX_XX_XX = 1;
        int index_XXX_XX_XX = 2;
    }

    //генерация года рождения
    private static int randomYear(){
        return (int)(Math.round(20*Math.random()) + 1970);
    }

    //генерация месяца рождения
    private static int randomMonth(){
        return (int)(Math.round(11*Math.random()));
    }

    //генерация дня рождения
    private static int randomDay(){
        return (int)(Math.round(28*Math.random()));
    }

    //генерация даты рождения в формате GregorianCalendar
    static GregorianCalendar birthDayGenerateToGC(){
        return new GregorianCalendar(randomYear(), randomMonth(), randomDay());
    }

    //генерация даты рождения в формате String
    static String birthDayGenerateToString(){
        GregorianCalendar birthday = new GregorianCalendar(randomYear(), randomMonth(), randomDay());
        return String.format("%02d-%02d-%4d",birthday.get(Calendar.DAY_OF_MONTH),
                (birthday.get(Calendar.MONTH)+1),birthday.get(Calendar.YEAR));
    }

    //генерация e-mail по заданным контактам
    static String eMailGenerate(String name, String surName){
        String[] emailEndings = new String[] {"@ukr.net", "@gmail.com", "@mail.ru", "@i.ua", "@yandex.ru", "@meta.ua"};
        name = convertToLatin(name);
        surName = convertToLatin(surName);
        return name + "_" + surName + emailEndings[rEnd()];
    }

    //генератор случайного числа от 0 до 9
    private static int rN(){
        return (int)(Math.round(9*Math.random()));
    }

    //генератор случайно длинны массива фамилии
    private static int rLength(){
        return (3 + (int)Math.round(2*Math.random()));
    }

    //генератор случайной первой буквы фамилии в виде цифры
    private static byte rFL(){
        return (byte)Math.round(27*Math.random());
    }

    //генератор случайного окончания фамилии
    private static byte rEnd(){
        return (byte)Math.round(5*Math.random());
    }

    //генератор случайной гласной фамилии в виде цифры
    private static byte rV(){
        return (byte)Math.round(8*Math.random());
    }

    //генератор случайной согласной фамилии в виде цифры
    private static byte rC(){
        return (byte)(9 + Math.round(19*Math.random()));
    }

    //замена в слове первой буквы на заглавную
    private static String firstLetterUp(String word){
        char[] newWord= word.toCharArray();
        newWord[0] = Character.toUpperCase(newWord[0]);
        return new String(newWord);
    }

    //конвертация русских слов в латинские
    //если передаётся слово на латинице, то метод возвращает оригинальное слово,
    //но все буквы будут в нижнем регистре
    private static String convertToLatin(String word){
        word = word.toLowerCase();
        char[] rusWord = word.toCharArray();
        String latinWord ="";
        boolean noConvert = false;
        for (char x : rusWord) {
            switch (x){
                case 'а':
                    latinWord = latinWord + "a";
                    break;
                case 'у':
                    latinWord = latinWord + "u";
                    break;
                case 'о':
                    latinWord = latinWord + "o";
                    break;
                case 'ы':
                    latinWord = latinWord + "i";
                    break;
                case 'и':
                    latinWord = latinWord + "i";
                    break;
                case 'э':
                    latinWord = latinWord + "e";
                    break;
                case 'я':
                    latinWord = latinWord + "ya";
                    break;
                case 'ю':
                    latinWord = latinWord + "yu";
                    break;
                case 'е':
                    latinWord = latinWord + "e";
                    break;
                case 'б':
                    latinWord = latinWord + "b";
                    break;
                case 'в':
                    latinWord = latinWord + "v";
                    break;
                case 'г':
                    latinWord = latinWord + "g";
                    break;
                case 'д':
                    latinWord = latinWord + "d";
                    break;
                case 'ж':
                    latinWord = latinWord + "zh";
                    break;
                case 'з':
                    latinWord = latinWord + "z";
                    break;
                case 'й':
                    latinWord = latinWord + "y";
                    break;
                case 'к':
                    latinWord = latinWord + "k";
                    break;
                case 'л':
                    latinWord = latinWord + "l";
                    break;
                case 'м':
                    latinWord = latinWord + "m";
                    break;
                case 'н':
                    latinWord = latinWord + "n";
                    break;
                case 'п':
                    latinWord = latinWord + "p";
                    break;
                case 'р':
                    latinWord = latinWord + "r";
                    break;
                case 'с':
                    latinWord = latinWord + "s";
                    break;
                case 'т':
                    latinWord = latinWord + "t";
                    break;
                case 'ф':
                    latinWord = latinWord + "f";
                    break;
                case 'х':
                    latinWord = latinWord + "h";
                    break;
                case 'ц':
                    latinWord = latinWord + "ts";
                    break;
                case 'ч':
                    latinWord = latinWord + "ch";
                    break;
                case 'ш':
                    latinWord = latinWord + "sh";
                    break;
                case 'щ':
                    latinWord = latinWord + "shch";
                    break;
                case 'ь':
                    latinWord = latinWord + "i";
                    break;
                case 'ъ':
                    latinWord = latinWord + "'";
                    break;
                case 'ё':
                    latinWord = latinWord + "e";
                    break;
                default:
                    latinWord = word;
                    noConvert = true;
                    break;
            }
            if(noConvert){break;}
        }
        return latinWord;
    }
}