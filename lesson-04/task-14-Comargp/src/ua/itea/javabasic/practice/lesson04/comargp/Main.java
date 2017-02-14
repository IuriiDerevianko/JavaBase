//D
package ua.itea.javabasic.practice.lesson04.comargp;
public class Main {
    public static void main(String[] args) {
        String string = "-1,2,-3,4,-5,6,-7,8,-9,10,-11,12,-13,14,-15,16,-17,18,-19,20";
        char[] charArray = string.toCharArray();
        int index = 0;
        int indexNewArray = 0;
        while(index < charArray.length) {
            if(charArray[index] == ',') {
                indexNewArray++;
            }
            index++;
        }
        int[] newArray = new int[indexNewArray+1];

        String number = "";
        index = 0;
        indexNewArray = 0;
        while(index < charArray.length) {
            if(charArray[index] == ',') {
                newArray[indexNewArray] = Integer.parseInt(number);
                indexNewArray++;
                index++;
                number = "";
            }
            else {
                number += charArray[index];
                index++;
            }
            if((indexNewArray == (newArray.length-1))&&(index == (charArray.length))) {
                newArray[indexNewArray] = Integer.parseInt(number);
                number = "";
            }
        }

        indexNewArray = 0;
        while(indexNewArray < newArray.length) {
            System.out.printf("%s%n", newArray[indexNewArray]);
            indexNewArray++;
        }
    }
}
