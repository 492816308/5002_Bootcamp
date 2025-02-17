public class LinkedQueueInt {

    private class Node
    {
        int value;
        Node next;
        Node(int val, Node n)
        {
            value = val;
            next = n;
        }
    }

    private Node front = null;
    private Node rear = null;

    public int max() {
        if (empty())
            throw new EmptyStackException();
        else
        {
            Node current = front;
            int maxValue = front.value;

            while (current != null) {
//                if (current.value >= maxValue) {
//                    maxValue = current.value;
//                }

                maxValue = Math.max(maxValue, current.value);
                current = current.next;
            }
            return maxValue;
        }
    }

    public int size() {
        int count = 0;
        Node temp = front;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    /**
     The method enqueue adds a value
     to the queue.
     @param s The value to be added
     to the queue.
     */

    public void enqueue(int s)
    {
        if (rear != null)
        {
            rear.next = new Node(s, null);
            rear = rear.next;
        }
        else
        {
            rear = new Node(s, null);
            front = rear;
        }
    }

    /**
     The empty method checks to see if
     the queue is empty.
     @return true if and only if queue
     is empty.
     */

    public boolean empty()
    {
        return front == null;
    }

    /**
     The method peek returns value at the
     front of the queue.
     @return item at front of queue.
     @excepton EmptyQueueException When the
     queue is empty.
     */

    public int peek()
    {
        if (empty())
            throw new EmptyQueueException();
        else
            return front.value;
    }

    /**
     The dequeue method removes and returns
     the item at the front of the queue.
     @return item at front of queue.
     @exception EmptyQueueException When
     the queue is empty.
     */

    public int dequeue()
    {
        if (empty())
            throw new EmptyQueueException();
        else
        {
            int value = front.value;
            front = front.next;
            if (front == null) rear = null;
            return value;
        }
    }

    /**
     The toString method concatenates all strings
     in the queue to give a string representation
     of the contents of the queue.
     @return string representation of this queue.
     */

    public String toString()
    {
        StringBuilder sBuilder = new StringBuilder();

        // Walk down the list and append all values
        Node p = front;
        while (p != null)
        {
            sBuilder.append(p.value + " ");
            p = p.next;
        }
        return sBuilder.toString();
    }
}