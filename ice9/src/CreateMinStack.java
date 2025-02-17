public class CreateMinStack {
    public static void main(String[] args) {
        CreateMinStack minStack = new CreateMinStack();
        //System.out.println("Pushing: ");
        minStack.push(4);
        minStack.push(0);
        minStack.push(-3);

        System.out.println(minStack);
        System.out.println("The minimum element is " + minStack.min());
    }

    private class Node {
        int value;
        Node next;
        public Node(int val, Node n) {
            value = val;
            next = n;
        }
    }
    private Node top = null;

    public boolean empty()
    {
        return top == null;
    }

    /**
     The push method adds a new item to the stack.
     @param n The item to be pushed onto the stack.
     */

    public void push(int n)
    {
        top = new Node(n, top);
    }

    /**
     The Pop method removes the value at the
     top of the stack.
     @return The value at the top of the stack.
     @exception EmptyStackException3 When the
     stack is empty.
     */

    public int pop()
    {
        if (empty())
            throw new EmptyStackException3();
        else
        {
            int retValue = top.value;
            top = top.next;
            return retValue;
        }
    }

    public int min() {
        if (empty())
            throw new EmptyStackException3();
        else
        {
            int retValue = top.value;
            if (retValue >= top.next.value) {
                retValue = top.next.value;
                top = top.next;
            }
            return retValue;
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node p = top;
        while (p != null) {
            builder.append(p.value + " ");
            p = p.next;
        }
        return builder.toString();
    }
}
