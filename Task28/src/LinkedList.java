
public class LinkedList<T> {
    private LinkedListNode<T> first = null;


    public void insert(LinkedListNode<T> node) {
        node.setNext(first);
        first = node;
    }


    public void remove(){
        if(first.getNext()!=null)
            first = first.getNext();
        else first = null;
    }


    private void printList(LinkedListNode<T> node) {
        System.out.println(node.getValue());
        if(node.getNext()!=null) printList(node.getNext());
    }

    public void print(){
        printList(first);
    }


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.insert(new LinkedListNode<String>("A"));
        list.insert(new LinkedListNode<String>("B"));
        list.insert(new LinkedListNode<String>("C"));
        list.insert(new LinkedListNode<String>("D"));
        list.print();
        list.remove();
        System.out.println();
        list.print();
    }
}
