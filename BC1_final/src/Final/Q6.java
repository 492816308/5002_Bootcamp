package Final;

public class Q6 {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {3, 1, 1, 2, 1};
        int X = 1;
        int count = findFrequency(arr, X);
        System.out.println("The frequency of " + X + " is " + count);
    }
    public static int findFrequency(int[] arr, int X) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == X) {
                count += 1;
            }
        }
        return count;
    }
}
