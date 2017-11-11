public class SingleLinkedList {
    private Node head;
    private Node tail;

    public SingleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void add(String data) {
        Node currentNode = new Node(data);
        if (head == null) {
            head = currentNode;
            tail = head;
            return;
        }
        currentNode.setNext(head);
        head.setPrev(currentNode);
        head = currentNode;
    }

    public Node poll(){
        if(tail != null) {
            Node currentNode = tail;
            tail = currentNode.getPrev ();
            tail.setNext(null);
            tail.setNext(null);
            return currentNode;
        } else return tail;
    }


    public Node find(String data) {
        Node currentNode = head;

        while ((!currentNode.getData().equals(data))) {
            currentNode = currentNode.getNext();
            if (currentNode.getNext() == null) {
                return null;
            }
        }
        return currentNode;

    }

    public void remove(String data) {
        Node currentNode = find(data);
        if (currentNode == null) {
            return;
        }

        if (currentNode == tail) {
            tail = currentNode.getPrev();
            currentNode.setPrev(null);
            tail.setNext(null);
        }

        Node leftNode = currentNode.getPrev();
        Node rightNode = currentNode.getNext();

        leftNode.setNext(rightNode);
        rightNode.setPrev(leftNode);

        currentNode.setNext(null);
        currentNode.setPrev(null);
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}