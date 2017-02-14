package ua.itea.javabasic.practice.lesson14.rectangle;
public class BigRectangle extends Rectangle {

    @Override
    public void setWidth(int width) throws TooSmallWidthException {
        if(width < 100)
            throw new TooSmallWidthException("illegal width (in BigRec): " + width + ";");
        this.width = width;
    }

    @Override
    public void setHeight(int height) throws TooSmallHeightException {
        if(height < 100)
            throw new TooSmallHeightException("illegal height (in BigRec): " + height + ";");
        this.height = height;
    }
}