public class List {
    Node head;
    Node tail;

    public void AddFirst(Node node) {
        if (head.getNext() == null) {
            head.setNext(node);
            node.setPrevious(head);
        } else {
            head.getNext().append(node);
        }
    }

    public void add(int value) {
        Node node = new Node(value);
        //node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }

    }
    public String revert(){
        Node currentNode = head;
        while (currentNode != null){
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null){
                tail = currentNode;
            }
            if (next == null){
                head = currentNode;
            }
            currentNode = next;
        }
        return this.toString();
    }

    public String toString() {
        Node currentNode  = head;
        StringBuilder sBuilder = new StringBuilder();
        while (currentNode  != null) {
            sBuilder.append(currentNode .getValue()).append(currentNode .hasNext() ? " " : "");
            currentNode  = currentNode .getNext();
        }
        return sBuilder.toString();
    }
}
