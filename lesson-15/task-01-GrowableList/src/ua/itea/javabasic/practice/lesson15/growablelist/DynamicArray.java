package ua.itea.javabasic.practice.lesson15.growablelist;
public class DynamicArray {
    private Object[] array;

    public DynamicArray(int lengthArray) {
        array = new Object[lengthArray];
    }


    /**
     * Получить элемент по индексу
     * При пустом элементе возвращает null
     * При несуществующем элементе IndexOutOfBoundsException
     */
    Object get(int index) {
        if(index > (array.length - 1)) throw new IndexOutOfBoundsException("Index not found!");
        return array[index];
    }


    /**
     * Установить элемент по индексу
     * При обращении к индексу, большему чем кол-во элементов, массив расширяется
     * При обращении к отрицательному индексу IndexOutOfBoundsException
     */
    void set(int index, Object element) {
        if(index < 0) throw new IndexOutOfBoundsException("You entered negative index!");
        if(index > (array.length - 1)) {
            Object[] newArray = new Object[index+1];
            for(int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[index] = element;
    }


    /**
     * Количество элементов находящихся в массиве
     */
    int size() {
        return array.length;
    }
}
