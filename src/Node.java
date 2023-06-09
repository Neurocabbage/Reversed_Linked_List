public class Node {
    Node previous;
    Node next;

    private int value;

    public Node(int value) {
       this.value = value;
    }
        public void append(Node node) {
        if (this.next == null) {
            this.next = node;
            node.previous = this;
        } else {
            this.next.append(node);
        }
    }

    public Node getNext() {
        return next;
    }


    public boolean hasNext() {
        return this.next != null;
    }

    public int getValue() {
        return value;
    }

}
