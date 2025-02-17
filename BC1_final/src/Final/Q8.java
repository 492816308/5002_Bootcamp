package Final;

public class Q8 {
    public static void main(String[] args) {
        double[][] table = {{1, 4, 9},
                            {11, 4, 3},
                            {2, 2, 3}};
        double secondRowTotal = getSumSecondRow(table);
        System.out.println("The sum of second row is " + secondRowTotal);
    }
    public static double getSumSecondRow(double[][] table) {
        double total = 0;
        final int ROW = 1;
        if (table.length < 2) {
            return total;
        }
        for (int col = 0; col < table[ROW].length; col++) {
            total += table[ROW][col];
        }
        return total;
    }
}
