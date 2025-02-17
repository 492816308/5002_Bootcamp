public class LinkedList0 {
    /**
     * The Node class represents a list node.
     */
    private class Node {
        String value;
        Node next;

        public Node(String val, Node n) {
            value = val;
            next = n;
        }

        public Node(String val) {
            value = val;
            next = null;
        }
    }
    private Node first = null;

    public LinkedList0() {
        first = new Node("Debby");
        first.next = new Node("John");
        first.next.next = new Node("Jane");
        first = new Node("Bob", first);

        String[] names = {"Eva", "Allen"};

        for (String name : names) {
            first = new Node(name, first);
        }
    }

    public void print() {
        Node ref = first;
        while (ref != null) {
            System.out.println(ref.value + " ");
            ref = ref.next;
        }
    }

    public static void main(String[] args) {
        LinkedList0 list = new LinkedList0();
        System.out.println("The contents of the list are: ");
        list.print();
    }
}
