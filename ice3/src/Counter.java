public class Counter {
    private static int instanceCount = 0;
    public static int timesTwo(int val1, int val2) {
        return val1 * val2;
    }
    public static void incrementCount() {
        instanceCount++;
    }
    public static int getInstanceCount() {
        return instanceCount;
    }
}

