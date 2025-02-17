package xwang10_midtermReview;

public class FruitBasket {
    Fruit head;
    enum FruitColor { RED, YELLOW, ORANGE, GREEN, BLUE }
    public class Fruit {
        String name;
        FruitColor color;
        Fruit next;
        public Fruit(String name, FruitColor color) {
            this.name = name;
            this.color = color;
            next = null;
        }
    }
    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        Fruit temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public String toString() {
        Fruit ref = head;
        StringBuilder str = new StringBuilder();
        while (ref != null) {
            str.append(ref.name + "  " + ref.color + "\n");
            ref = ref.next;
        }
        return str.toString();
    }

    public void add(String name, FruitColor color) {
        Fruit newFruit = new Fruit(name, color);
        if (isEmpty()) {
            head = newFruit;
        }
        else {
            newFruit.next = head;
            head = newFruit;
        }
    }
}
