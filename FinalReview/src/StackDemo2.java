import java.util.Stack;

public class StackDemo2 {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        for (int k = 1; k < 10; k++) {
            intStack.push(k*k);
        }
        while (!intStack.empty()) {
            int x = intStack.pop();
            System.out.print(x + " ");
        }
    }
}
