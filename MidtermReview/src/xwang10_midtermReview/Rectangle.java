package xwang10_midtermReview;

public class Rectangle {
    private double length;
    private double width;

    /**
     * Constructor
     * @param len The length of the rectangle.
     * @param w The width of the rectangle.
     */
    public Rectangle(double len, double w) {
        length = len;
        width = w;
    }

    /**
     * No-arg constructor
     */
    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    public void setLength(double len){
        length = len;
    }

    public void setWidth(double w){
        width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }
}
