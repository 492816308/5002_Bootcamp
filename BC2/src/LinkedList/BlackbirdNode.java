package LinkedList;

class BlackbirdNode {
    private int chicksVal;
    private BlackbirdNode nextNodeRef;

    public BlackbirdNode(int chicksInit) {
        this.chicksVal = chicksInit;
        this.nextNodeRef = null;
    }

    public void insertAfter(BlackbirdNode nodeLoc) {
        BlackbirdNode tmpNext = null;

        tmpNext = this.nextNodeRef;
        this.nextNodeRef = nodeLoc;
        nodeLoc.nextNodeRef = tmpNext;
    }

    public BlackbirdNode getNext() {
        return this.nextNodeRef;
    }

    public void printNodeData() {
        System.out.println(this.chicksVal);
    }
}
