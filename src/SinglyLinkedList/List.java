package SinglyLinkedList;

public class List {
    Node head, tail, temp;
    public List() {
        this.head = null;
        this.tail = null;
    }

    protected void prepend(Node data) {
        if (this.head == null) {
            this.head = data;
            this.tail = data;
        } else {
            data.next = this.head;
            this.head = data;
        }
    }

    protected void append(Node data) {
        if (this.tail == null) {
            this.head = data;
            this.tail = data;
        } else {
            this.tail.next = data;
            this.tail = data;
            data.next = null;
        }
    }

    protected void after(Node data, Node before) {
        temp = this.head;
        if (this.head == null || this.tail == null) {
            this.head = data;
            this.tail = data;
        } else {
            while (temp.data != before.data) {
                temp = temp.next;
            }
            if (temp.next == null) {
                this.tail.next = data;
                this.tail = data;
                this.tail.next = null;
            } else {
                data.next = temp.next;
                temp.next = data;
            }
        }
    }

    protected void deleteFistElement() {
        if (this.head == null)
            System.out.println("List Empty");
        else {
            this.head = this.head.next;
        }
    }

    protected void deleteLastElement() {
        temp = this.head;
        Node prev = null;
        if (this.tail == null)
            System.out.println("List Empty");
        else {
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            if (prev == null) {
                this.head = null;
            }
            else{
                this.tail = prev;
                prev.next = null;
            }

        }
    }

    protected void deleteElement(Node element) {
        if (this.head == null || this.tail == null)
            System.out.println("List Empty");
        else if (this.head.data == element.data) {
            deleteFistElement();
        } else if (this.tail.data == element.data) {
            deleteLastElement();
        } else {
            temp = this.head;
            Node before = this.head;
            while (temp.data != element.data) {
                before = temp;
                temp = temp.next;
                if (temp == null) break;
            }
            if (temp == null) {
                System.out.println("Element Not Found\n");
            } else before.next = temp.next;
        }
    }

    protected void print() {
        temp = this.head;
        int count = 0;
        if (temp != null)
            System.out.println("HEAD -> " + this.head.data + "\t TAIL -> " + this.tail.data);
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            count++;
        }

        System.out.println("null");
        System.out.println("List Length : " + count + "\n");
    }
}
