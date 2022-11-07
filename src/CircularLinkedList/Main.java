package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.prepend(new Node(32));
        list.print();
        list.prepend(new Node(45));
        list.print();
    }
}
