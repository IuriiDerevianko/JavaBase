package ua.itea.javabasic.practice.lesson16.getclass;
public class ColorRectangle extends Rectangle {
    private final int color;

    /**
     *
     * @param width
     * @param height
     * param color RGB color in int? e.g. 0xFF0000 for re color? 0xFFFFF for white one
     */
    public ColorRectangle(int width, int height, int color) {
        super(width, height);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "ColorRectangle{" +
                "width=" + getWidth() +
                ", height=" + getHeight() +
                ", color=" + getColor() +
                '}';
    }
}
