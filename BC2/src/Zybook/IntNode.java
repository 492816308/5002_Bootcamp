package Zybook;

public class IntNode {
    private int value;
    private IntNode nextIntNodeRef;

    IntNode() {
        this.value = 0;
        this.nextIntNodeRef = null;
    }

    IntNode(int val) {
        this.value = val;
        this.nextIntNodeRef = null;
    }

    IntNode(int val, IntNode nextLoc) {
        this.value = val;
        this.nextIntNodeRef = nextLoc;
    }
3421
    void insertAfter(IntNode nodeLoc) {
        IntNode tmpNext = null;

        tmpNext = this.nextIntNodeRef;
        this.nextIntNodeRef = nodeLoc;
        nodeLoc.nextIntNodeRef = tmpNext;
    }



    int GetValue() {
        return this.value;
    }

    IntNode GetNext() {
        return this.nextIntNodeRef;
    }

    void PrintData() {
        System.out.println(this.value);
    }
}
