package xwang10_lab8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void enqueue() {
        Queue<Double> queueDouble = new Queue<>();
        queueDouble.enqueue(1.2);
        assertEquals(1.2, queueDouble.peek());

        Queue<String> queueString = new Queue<>();
        queueString.enqueue("hello");
        assertEquals("hello", queueString.peek());
    }

    @Test
    void empty() {
        Queue<Double> queueDouble = new Queue<>();
        boolean isEmpty = queueDouble.empty();
        assertEquals(isEmpty, true);

        Queue<String> queueString = new Queue<>();
        boolean isEmpty2 = queueString.empty();
        assertEquals(isEmpty2, true);
    }

    @Test
    void dequeue() {
        Queue<Double> queueDouble = new Queue<>();
        queueDouble.enqueue(1.4);
        queueDouble.enqueue(1.5);
        queueDouble.dequeue();
        assertEquals(1.5, queueDouble.peek());

        Queue<String> queueString = new Queue<>();
        queueString.enqueue("hello");
        queueString.enqueue("world");
        queueString.dequeue();
        assertEquals("world", queueString.peek());

    }

    @Test
    void peek() {
        Queue<Double> queueDouble = new Queue<>();
        queueDouble.enqueue(1.6);
        assertEquals(1.6, queueDouble.peek());

        Queue<String> queueString = new Queue<>();
        queueString.enqueue("hello");
        assertEquals("hello", queueString.peek());
    }

    @Test
    void testToString() {
        Queue<Double> queueDouble = new Queue<>();
        queueDouble.enqueue(1.8);
        assertEquals("1", "1", queueDouble.toString());

        Queue<String> queueString = new Queue<>();
        queueString.enqueue("hello");
        assertEquals("2", "2", queueString.toString());
    }
}