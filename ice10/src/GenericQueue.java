
/*
  This class will do a deep copy, append, along with the other items such as fromString, toString
 */
public class GenericQueue<T>
{
    private class Node {
        private T value;
        Node next;
        Node (T c, Node n) {
            value = c;
            next = n;
        }
    }

    private Node head;  // Head of the Queue
    private Node tail;  // tail of the Queue

    public GenericQueue()
    {
        head = null;
        tail = null;
    }

    public boolean empty()
    {
        return head == null;
    }

    public T dequeue()
    {
        T retValue;

        if (empty())
        {
            throw new IllegalArgumentException();
        }
        else
        {
            // Return the generic item from the queue
            retValue = head.value;
            head = head.next;
            if (head == null) tail = null;
            return retValue;
        }
    }

    public T peek()
    {

        if (empty())
        {
            throw new IllegalArgumentException();
        }
        else
        {
            // Return the generic item from the queue
            return head.value;
        }
    }

    public void enqueue (T val)
    {
        // Put it into queue
        if (tail != null)
        {
            tail.next = new Node(val, null);
            tail = tail.next;
        }
        else
        {
            tail = new Node(val, null);
            head = tail;
        }
    }

/*
    deepCopy will return a true physical replication of the contents of the currentQueue
 */
    public GenericQueue <T> deepCopy()
    {
        GenericQueue <T> retQueue =new GenericQueue <T>();
        Node n = this.head;
        while (n != null) {
            retQueue.enqueue(n.value);
            n = n.next;
        }
        return retQueue;
    }

/*
    append will take a queue as a parameter, and add it to current queue. We have to create another queue to hold the
    parameterized queue because we don't want to change the pointers
 */
    public void appendToCurrentQueue(GenericQueue <T> passQueue)
    {

        GenericQueue <T> tempQueue = passQueue.deepCopy();
        while (tempQueue.head != null) {
            this.enqueue(tempQueue.head.value);
            tempQueue.head = tempQueue.head.next;
        }
    }

    public GenericQueue <T>  appendAndCreateNewQueue(GenericQueue <T> passQueue)
    {
        // TODO
        return null;
    }

    public String toString()
    {
        StringBuilder sBuilder = new StringBuilder();
        // TODO
        return null;
    }

}
