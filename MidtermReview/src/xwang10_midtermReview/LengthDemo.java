package xwang10_midtermReview;

import java.awt.*;

public class LengthDemo {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5.0, 15.0);
        Rectangle r = new Rectangle();
        //System.out.println("Sending the value 10.0 to the setLength method.");
        //System.out.println("Sending the value 20.0 to the setWidth method.");
        //box.setLength(10.0);
        //box.setWidth(20.0);

        System.out.println("The box's length is " + box.getLength());
        System.out.println("The box's width is " + box.getWidth());
        System.out.println("The box's area is " + box.getArea());
        System.out.println("Done.");
    }
}
