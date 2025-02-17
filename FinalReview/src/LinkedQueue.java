import java.util.NoSuchElementException;

public class LinkedQueue {
    private class Node {
        String value;
        Node next;
        Node(String val, Node n) {
            value = val;
            next = n;
        }
    }
    private Node front = null;
    private Node rear = null;

    public void enqueue(String e) {
        if (rear != null) {
            rear.next = new Node (e, null);
            rear = rear.next;
        } else {
            rear = new Node(e, null);
            front = rear;
        }
    }

    public boolean empty() {
        return front == null;
    }

    public String peek() {
        if (empty()) {
            throw new NoSuchElementException();
        } else
            return front.value;
    }

    public String dequeue() {
        if (empty()) {
            throw new NoSuchElementException();
        } else {
            String value = front.value;
            front = front.next;
            if (front == null) rear = null;
            return value;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node p = front;
        while (p != null) {
            sb.append(p.value + " ");
            p = p.next;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedQueue q = new LinkedQueue();
        String[] names = {"Alfonso", "Bob", "Carol", "Deborah"};
        System.out.println("Adding names: ");
        for (String name : names) {
            System.out.print(name + " ");
            q.enqueue(name);
        }
        System.out.println("\nState of queue is: ");
        System.out.println(q);

        System.out.println("Removing 2 names.");
        q.dequeue(); q.dequeue();
        System.out.println("State of queue is: ");
        System.out.println(q);

        System.out.println("Adding the name Elaine:");
        q.enqueue("Elaine");
        System.out.println("State of queue is: ");
        System.out.println(q);
    }
}
