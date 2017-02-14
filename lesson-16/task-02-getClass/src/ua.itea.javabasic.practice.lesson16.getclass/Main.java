//D
package ua.itea.javabasic.practice.lesson16.getclass;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Object[] rectangles = {
                new Rectangle(12, 7),
                new ColorRectangle(10, 20, 0xffaaff),
                new Rectangle(190, 270),
                new ColorRectangle(4, 3, 0x000000),
        };
        Rectangle[] simpleRectangles = extractRectanglesFrom(rectangles);
        ColorRectangle[] colorRectangles = extractColorRectanglesFrom(rectangles);
        System.out.println(Arrays.toString(simpleRectangles));
        System.out.println(Arrays.toString(colorRectangles));
    }

    private static Rectangle[] extractRectanglesFrom(Object[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].getClass().getSimpleName().equals("Rectangle")) {
                counter++;
            }
        }

        Rectangle[] rectangleArray = new Rectangle[counter];
        for (int i = 0, j = 0; i < array.length; i++) {
            if(array[i].getClass().getSimpleName().equals("Rectangle")) {
                rectangleArray[j] = (Rectangle)array[i];
                j++;
            }
        }
        return rectangleArray;
    }

    private static ColorRectangle[] extractColorRectanglesFrom(Object[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].getClass().getSimpleName().equals("ColorRectangle")) {
                counter++;
            }
        }

        ColorRectangle[] colorRectangleArray = new ColorRectangle[counter];
        for (int i = 0, j = 0; i < array.length; i++) {
            if(array[i].getClass().getSimpleName().equals("ColorRectangle")) {
                colorRectangleArray[j] = (ColorRectangle)array[i];
                j++;
            }
        }
        return colorRectangleArray;
    }
}
