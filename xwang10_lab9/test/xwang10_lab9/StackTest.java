package xwang10_lab9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void empty() {
        Stack<Double> stackDouble = new Stack<>();
        boolean isEmpty = stackDouble.empty();
        assertEquals(true, isEmpty);

        Stack<String> stackString = new Stack<>();
        boolean isEmpty2 = stackString.empty();
        assertEquals(true, isEmpty2);
    }

    @Test
    void push() {
        Stack<Double> stackDouble = new Stack<>();
        stackDouble.push(1.0);
        assertEquals(1.0, stackDouble.peek());

        Stack<String> stackString = new Stack<>();
        stackString.push("what");
        assertEquals("what", stackString.peek());
    }

    @Test
    void pop() {
        Stack<Double> stackDouble = new Stack<>();
        stackDouble.push(1.0);
        stackDouble.push(2.0);
        stackDouble.pop();
        assertEquals(1.0, stackDouble.peek());

        Stack<String> stackString = new Stack<>();
        stackString.push("what");
        stackString.push("is");
        stackString.pop();
        assertEquals("what", stackString.peek());
    }

    @Test
    void peek() {
        Stack<Double> stackDouble = new Stack<>();
        stackDouble.push(3.0);
        assertEquals(3.0, stackDouble.peek());

        Stack<String> stackString = new Stack<>();
        stackString.push("what");
        assertEquals("what", stackString.peek());
    }

    @Test
    void testToString() {
        Stack<Double> stackDouble = new Stack<>();
        stackDouble.push(4.0);
        assertEquals("1", "1", stackDouble.toString());

        Stack<String> stackString = new Stack<>();
        stackString.push("matter");
        assertEquals("2", "2", stackString.toString());
    }
}