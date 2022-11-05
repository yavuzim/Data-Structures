package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("** Singly Linked List **");
        List list = new List();
        list.print();
        list.prepend(new Node(1));
        list.print();
        list.prepend(new Node(2));
        list.print();
        list.append(new Node(3));
        list.print();
        list.after(new Node(78), new Node(2));
        list.print();
        list.after(new Node(79), new Node(3));
        list.print();
        list.after(new Node(81), new Node(1));
        list.print();
        list.deleteFistElement();
        list.print();
        list.deleteLastElement();
        list.print();
        list.deleteElement(new Node(1));
        list.print();
        list.deleteElement(new Node(3));
        list.print();
        list.deleteElement(new Node(81));
        list.print();
        list.deleteFistElement();
        list.print();
    }
}
