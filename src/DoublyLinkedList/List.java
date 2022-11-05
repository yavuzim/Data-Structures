package DoublyLinkedList;

public class List {
    Node head, tail;

    public List() {
        this.head = null;
        this.tail = null;
    }

    protected void prepend(Node data) {
        if (this.head == null) {
            this.head = data;
            this.tail = data;
        } else {
            this.head.prev = data;
            data.next = this.head;
            this.head = data;
            this.head.prev = null;
        }
    }

    protected void append(Node data) {
        if (this.tail == null) {
            this.head = data;
            this.tail = data;
        } else {
            this.tail.next = data;
            data.prev = this.tail;
            this.tail = data;
            this.tail.next = null;
        }
    }

    protected void after(Node data, Node before) {
        if (this.head == null || this.tail == null) {
            this.head = data;
            this.tail = data;
        } else {
            Node temp = this.head;
            while (temp.data != before.data) {
                temp = temp.next;
            }
            if (temp.next == null) {
                this.tail.next = data;
                data.prev = this.tail;
                this.tail = data;
                this.tail.next = null;
            } else {
                temp.next.prev = data;
                data.next = temp.next;
                data.prev = temp;
                temp.next = data;
            }
        }
    }

    protected void deleteFirstElement() {
        if (this.head == null)
            System.out.println("List Empty");
        else {
            this.head = this.head.next;
            if (this.head != null)
                this.head.prev = null;
        }
    }

    protected void deleteLastElement() {
        if (this.tail == null)
            System.out.println("List Empty");
        else {
            if (this.tail.prev == null) {
                this.head = null;
                this.tail = null;
            } else {
                this.tail = this.tail.prev;
                this.tail.next = null;
            }
        }
    }

    protected void deleteElement(Node node) {
        if (this.head == null || this.tail == null)
            System.out.println("List Empty");
        else {
            Node temp = this.head;
            while (temp.data != node.data) {
                temp = temp.next;
            }
            if (temp.next == null) {
                deleteLastElement();
            } else if (temp.prev == null) {
                deleteFirstElement();
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }

    protected void print() {
        int count = 0;
        Node temp = this.head;
        if (temp != null) {
            System.out.println("Head : " + this.head.data + "\t Tail : " + this.tail.data);
        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            count++;
        }
        System.out.println("null");
        System.out.println("List Length : " + count + "\n");
    }
}


