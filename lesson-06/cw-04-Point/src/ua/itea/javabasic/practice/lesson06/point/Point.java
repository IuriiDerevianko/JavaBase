//D
package ua.itea.javabasic.practice.lesson06.point;
public class Point {
    int x;
    int y;
    int z;

    void addToAbscissa(int units) {
        x += units;
    }

    //ordinate
    void ordinate(int y) {
        this.y = y;
    }
    //applicate
    void applicate(int z) {
        this.z = z;
    }
    //moveTo <coordinate>
    void moveTo(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //moveTo <point>
    void moveTo(Point pointAnother) {
        this.x = pointAnother.x;
        this.y = pointAnother.y;
        this.z = pointAnother.z;
    }

    int distanceTo(Point another) {
        return (int)Math.sqrt(Math.pow(another.x - x,2) + Math.pow(another.y - y,2) + Math.pow(another.z - z,2));
    }
}

