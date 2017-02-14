package ua.itea.javabasic.practice.lesson14.journal;
import java.util.Date;

// exposes index!
class Register {
    private Person[] array;
    private int length;

    public Register() {
        this.array = new Person[100_000];
        this.length = 0;
    }

    public void add(Person s) {
        array[length++] = s;
    }

    public void delete(int index){
        for (int i = 0, j =0; i < length; i++, j++) {
            if(j == index){
                j++;
                length--;
            }
            array[i] = array[j];
        }
    }

    public Person get(int index) {
        return array[index];
    }

    public int indexByName(String name) {
        for (int i = 0; i < length; i++) {
            if (array[i].getName().equalsIgnoreCase(name))
                return i;
        }
        return -1;
    }

    public int indexBySurname(String surname) {
        for (int i = 0; i < length; i++) {
            if (array[i].getSurname().equalsIgnoreCase(surname))
                return i;
        }
        return -1;
    }

    public int indexByDate(Date date) {
        for (int i = 0; i < length; i++) {
            if (array[i].getBirth().equals(date))
                return i;
        }
        return -1;
    }

    public int getLength() {
        return length;
    }
}