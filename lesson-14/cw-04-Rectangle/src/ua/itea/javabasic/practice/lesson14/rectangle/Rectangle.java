package ua.itea.javabasic.practice.lesson14.rectangle;
public class Rectangle {
    protected int height, width;

    public void setWidth(int width) throws IllegalWidthException {
        if(width < 0)
            throw new IllegalWidthException("illegal width: " + width + ";");
        this.width = width;
    }

    public void setHeight(int height) throws IllegalHeightException {
        if(height < 0)
            throw new IllegalHeightException("illegal height: " + height + ";");
        this.height = height;
    }
}
