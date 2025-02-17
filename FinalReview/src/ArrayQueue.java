import java.util.*;
public class ArrayQueue {
    private String[] q;
    private int front;
    private int rear;
    private int size;

    ArrayQueue(int capacity) {
        q = new String[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }
    public int capacity() {
        return q.length;
    }

    public boolean empty() {
        return size == 0;
    }

    public void enqueue(String s) {
        if (size == q.length)
            throw new NoSuchElementException();
        else {
            size ++;
            q[rear] = s;
            rear++;
            if (rear == q.length)
                rear = 0;
        }
    }

    public String peek() {
        if (empty())
            throw new NoSuchElementException();
        else
            return q[front];
    }

    public String dequeue() {
        if (empty())
            throw new NoSuchElementException();
        else {
            size--;
            String value = q[front];
            q[front] = null; // Facilitate garbage collection
            front++;
            if (front == q.length)
                front = 0;
            return value;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("front = " + front + "; ");
        sb.append("rear = " + rear + "\n");
        for (int i = 0; i < q.length; i++) {
            if (q[i] != null)
                sb.append(i + " " + q[i]);
            else
                sb.append(i + " ?");
            if (i != q.length - 1)
                sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str;
        ArrayQueue queue = new ArrayQueue(4);
        str = "Queue has capacity ";
        System.out.println(str + queue.capacity());

        String[] names = {"Alfonso", "Bob", "Carol", "Deborah"};
        System.out.println("Adding names: ");
        for (String name : names) {
            System.out.print(name + " ");
            queue.enqueue(name);
        }
        System.out.println("\nState of queue is: ");
        System.out.println(queue);

        System.out.println("Removing 2 names.");
        queue.dequeue(); queue.dequeue();
        System.out.println("State of queue is: ");
        System.out.println(queue);

        System.out.println("Adding the name Elaine:");
        queue.enqueue("Elaine");
        System.out.println("State of queue is: ");
        System.out.println(queue);
    }
}
