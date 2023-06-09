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

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node pre) {
        this.previous = pre;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean hasPrevious() {
        return this.previous != null;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public int getValue() {
        return value;
    }

}
