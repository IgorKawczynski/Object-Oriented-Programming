package pl.imiajd.kawczynski;
import java.awt.*;

public class BetterRectangle extends java.awt.Rectangle{


    public BetterRectangle(int x, int y, int width, int heigth) {
//        super();
        setLocation(x, y);
        setSize(width, heigth);
    }

    public int getPerimeter() {
        int perimeter = 0;
        perimeter = width * height;
        return perimeter;
    }

    public int getArea() {
        int area = 0;
        area = (2 * width) + (2 * height);
        return area;
    }


}
