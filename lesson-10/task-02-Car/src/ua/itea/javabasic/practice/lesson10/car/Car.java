package ua.itea.javabasic.practice.lesson10.car;
public abstract class Car {
    protected int id;

    public abstract void carInform (String model, double engine, double fuel);

    public abstract void beep (String model);
}
