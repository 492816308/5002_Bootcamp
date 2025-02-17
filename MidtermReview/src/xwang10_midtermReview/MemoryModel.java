package xwang10_midtermReview;
public class MemoryModel {
    private int[] testScores;
    private int testId;
    static int numMemoryModel = 0;
    static String testMemory = "Test Memory";

    public MemoryModel(int testId) {
        testScores = new int[]{75, 97, 76, 98};
        this.testId = testId;
        numMemoryModel++;
    }

    public  void calculate()
    {
        this.testScores[0]=this.testScores[2] + this.testScores[3];
    }

    private static void printGoodbye() {
        double z = 5;
        int xyz = 3;
        System.out.println("Goodbye");  // Stop here
    }

    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        double total = 0;
        total++;
        x = x * y;
        y = y * 10;
        MemoryModel mObj1 = new MemoryModel(33);
        mObj1.calculate();
        printGoodbye();
    }
}