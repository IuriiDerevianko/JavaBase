//D
package ua.itea.javabasic.practice.lesson14.rectangle;
public class Main {
    public static void main(String[] args) {
        Rectangle mainBorder = new Rectangle();

        try {
            mainBorder.setWidth(320);
            mainBorder.setHeight(-240);
        } catch (IllegalWidthException|IllegalHeightException e) {
            System.out.println(e.getMessage());
        }

        try {
            mainBorder.setHeight(-640);
            mainBorder.setWidth(-480);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



        BigRectangle bigRec = new BigRectangle();

        try {
            bigRec.setWidth(120);
            bigRec.setHeight(40);
        } catch (TooSmallWidthException|TooSmallHeightException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            bigRec.setWidth(120);
            bigRec.setHeight(-240);
        } catch (IllegalWidthException|IllegalHeightException e) {
            System.out.println(e.getMessage());
        }
    }
}
