package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.prepend(new Node(25));
        list.print();
        list.prepend(new Node(30));
        list.print();
        list.prepend(new Node(35));
        list.print();
        list.append(new Node(45));
        list.print();
        list.append(new Node(55));
        list.print();
        list.after(new Node(81), new Node(25));
        list.print();
        list.after(new Node(82), new Node(35));
        list.print();
        list.after(new Node(89), new Node(55));
        list.print();
        list.deleteFirstElement();
        list.print();
        list.deleteFirstElement();
        list.print();
        list.deleteLastElement();
        list.print();
        list.deleteLastElement();
        list.print();
        list.deleteLastElement();
        list.print();
        list.deleteElement(new Node(30));
        list.print();
        list.deleteElement(new Node(25));
        list.print();
        list.deleteLastElement();
        list.print();
        list.append(new Node(85));
        list.print();
        list.append(new Node(89));
        list.print();
        list.prepend(new Node(78));
        list.print();
        list.deleteLastElement();
        list.print();
        list.deleteFirstElement();
        list.print();
        list.deleteFirstElement();
        list.print();
    }
}
