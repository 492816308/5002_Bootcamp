import java.util.EmptyStackException;

public class LinkedStack {
    private class Node {
        String value;
        Node next;
        Node(String val, Node n) {
            value = val;
            next = n;
        }
    }
    private Node top = null;

    public boolean empty() {
        return top == null;
    }

    public void push(String s) {
        top = new Node(s, top);
    }
    public String pop() {
        if (empty()) {
            throw new EmptyStackException();
        } else {
            String retValue = top.value;
            top = top.next;
            return retValue;
        }
    }

    public String peek() {
        if (empty()) {
            throw new EmptyStackException();
        } else {
            return top.value;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node cur = top;
        while (cur != null) {
            sb.append(cur.value);
            cur = cur.next;
            if (cur != null) {
                sb.append(" -> ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        System.out.println("Pushing: Amy Bob Chuck");
        System.out.println("Contents of Stack:");
        stack.push("Amy");
        stack.push("Bob");
        stack.push("Chuck");
        System.out.println(stack);
        System.out.println("Popped: " + stack.pop());
        System.out.println("Contents of Stack:");
        System.out.println(stack);
    }
}
