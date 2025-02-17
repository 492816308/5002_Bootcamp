public class Balloon {

    private String text;

    private double height, width;

    private Point location;

    public Balloon(String text, double h, double w,

                   double x, double y) {
x
    }

    public void resize(double newHeight, double newWidth) {
        height = newHeight;
        width = newWidth;
    }

    public void move(double newX, double newY) {
        location = new Point(newX, newY);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}