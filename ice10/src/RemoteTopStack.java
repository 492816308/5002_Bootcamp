public class RemoteTopStack {
    public static LinkedQueue removeTopOfStack(LinkedStack stack, String upTo)
    {
        LinkedQueue newQueue = new LinkedQueue();
        boolean found = false;
        while (!found && !stack.empty())
        {
            if (!upTo.equals(stack.peek()))
            {
                newQueue.enqueue(stack.peek());
                stack.pop();
            }
            else
            {
                found = true;
            }
        }
        if (stack.empty())
        {
            throw new EmptyStackException();
        }
        else
            return newQueue;
    }

    public static void main(String[] args)
    {
        LinkedStack stackObj = new LinkedStack();

        stackObj.push("a");
        stackObj.push("b");
        System.out.println(stackObj);
        stackObj.push("d");
        System.out.println(stackObj);
        removeTopOfStack(stackObj, "a");
        System.out.println(stackObj);

    }
}
