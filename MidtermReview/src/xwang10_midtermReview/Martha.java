package xwang10_midtermReview;

public class Martha {
    int x1 = 5;

    public String toString() {
        return("I'm a Martha");
    }
    public static void main(String[] args) {
        Martha m = new Martha();
        m.x1 = 6;
        System.out.println(m);
    }

}

// Note compile errors are line 2 where it should be int x1=5;
// line 4 where it should be private String toString
// Should be a return on line 5
// line 8 wont work, might require
