import java.util.ArrayList;
import java.util.EmptyStackException;

public class Tower {
    private ArrayList<Integer> stack;

    public Tower() {
        stack = new ArrayList<>();
    }
    public void push(int n) {
        if (!empty() && peek() < n)
            throw new IllegalArgumentException("cannot push larger onto smaller");
        stack.add(n);
    }
    public boolean empty() {
        return stack.isEmpty(); // ArrayList's method
    }
    public int peek() {
        if (empty())
            throw new EmptyStackException();
        return stack.get(stack.size() - 1);
    }
    public int pop() {
        int elem = peek();
        stack.remove(stack.size() - 1);
        return elem;
    }
    public int depth() {
        return stack.size();
    }
    public String toString() {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = stack.size() - 1; i >= 0; i--)
            strings.add(stack.get(i).toString());
        return "[" + String.join(",", strings) + "]";
    }
}
