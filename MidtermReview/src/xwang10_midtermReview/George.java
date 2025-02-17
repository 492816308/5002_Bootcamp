package xwang10_midtermReview;

public class George {
    private static int base = 100;
    public int ii, iv;
    private double[] board;

    public static void main(String [] arg) {
        George georgeObj = new George();
        System.out.println("The value of georgeObj.iv is " + georgeObj.getIv());
    }

    public George() {
        ii = f();
        iv += ii;
    }

    private int f(int d) {
        board = new double[base + d];
        return base;
    }

    private int f() {
        iv = 2;
        iv += 3;
        iv += f(iv);
        George.base++;
        return board.length;
    }

    public int getIv() {
        return this.iv;
    }

}
