import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class ArrayStack {
    private int[] s;
    private int top;

    public ArrayStack(int capacity) {
        s = new int[capacity];
        top = 0;
    }

    public boolean empty() {
        return top == 0;
    }

    public void push(int x) {
        if (top == s.length) {
            throw new StackOverflowError();
        } else {
            s[top] = x;
            top++;
        }
    }

    public int pop() {
        if (empty()) {
            throw new EmptyStackException();
        } else {
            top--;
            return s[top];
        }
    }

    public int peek() {
        if (empty()) {
            throw new StackOverflowError();
        } else {
            return s[top-1];
        }
    }
}
