public class ThisDemo {
    int x;

    // Constructor with a parameter
    public ThisDemo(int x) {
        this.x = x;
    }

    // Call the constructor
    public static void main(String[] args) {
        ThisDemo myObj = new ThisDemo(5);
        System.out.println("Value of x = " + myObj.x);
    }
}
