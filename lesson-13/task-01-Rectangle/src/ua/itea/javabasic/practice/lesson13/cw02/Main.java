//D
package ua.itea.javabasic.practice.lesson13.cw02;
class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Rectangle.PointInitializer.parse("12:345");
        System.out.println("Begin is " + Rectangle.getBegin() + ";");
        System.out.println("End is " + Rectangle.getEnd() + ";");
        System.out.println(rec.toString());
    }
}
