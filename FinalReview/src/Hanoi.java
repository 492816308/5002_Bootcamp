public class Hanoi {
    private enum Peg {A ,B, C}
    private Tower a, b, c;

    public Hanoi(int n) {
        a = new Tower();
        b = new Tower();
        c = new Tower();
        for (int i = n; i > 0; i--)
            a.push(i);
    }

    private void move(Peg from, Peg to) {
        int disk = getTower(from).pop();
        getTower(to).push(disk);
        System.out.println("Moving disk " + disk + " from " + from +
                           " to " + to +"" + this);
    }

    private Tower getTower(Peg peg) {
        switch (peg) {
            case A: return a;
            case B: return b;
            case C: default: return c;
        }
    }

    public String toString() {
        return "A:" + a + " B:" + b + " C:" + c;
    }

    public void solve() {
        System.out.println("start: " + this);
        if(a.depth() == 1) {
            move(Peg.A, Peg.B);
        } else if (a.depth() == 2) {
            move(Peg.A, Peg.C);
            move(Peg.A, Peg.B);
            move(Peg.C, Peg.B);
        } else if (a.depth() == 3) {
            move(Peg.A, Peg.B);
            move(Peg.A, Peg.C);
            move(Peg.B, Peg.C);
            move(Peg.A, Peg.B);
            move(Peg.C, Peg.A);
            move(Peg.C, Peg.B);
            move(Peg.A, Peg.B);
        } else {
            System.out.println("too deep!");
        }
        System.out.println("finish: " + this);
    }
}
