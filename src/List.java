public class List {
    Node head;
    Node tail;


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
