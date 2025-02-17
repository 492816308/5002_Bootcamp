import java.util.Stack;

public class StackDemo1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String[] names = {"Al", "Bob", "Carol"};
        System.out.println("Pushing onto the stack the names: ");
        System.out.println("Al Bob Carol");
        for (String name : names) {
            stack.push(name);
        }
        System.out.println("Popping and printing all stack values:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
