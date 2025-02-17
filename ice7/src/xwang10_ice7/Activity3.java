package xwang10_ice7;

public class Activity3 {
    public boolean haveNode (Node p) {
        while (first != null) {
            if (first.value == p.value) {
                return true;
            }
            first = first.next;
        }
        return false;
    }
}
