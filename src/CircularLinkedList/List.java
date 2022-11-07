package CircularLinkedList;

public class List {
    Node head;

    public List() {
        this.head = null;
    }

    protected void prepend(Node data) {
        if (this.head == null) {
            this.head = data;
            this.head.next = data;
            this.head.prev = data;
        } else {
            data.next = this.head;
            data.prev = this.head;
            this.head.next = data;
            this.head.prev = data;
            this.head = data;
        }

    }

    protected void print() {
        Node temp = this.head;
        int length = 0;
        if (this.head != null) {
            System.out.println("Head : " + this.head.data);
        }
        while (true) {
           if(temp.next==this.head){
               System.out.println("Value : "+temp.data);
               System.out.println("Value Next : "+temp.next.data);
               System.out.println("Value Prev : "+temp.prev.data);
               length++;
               break;
           }
           else{
               System.out.println("Value : "+temp.data);
               System.out.println("Value Next : "+temp.next.data);
               System.out.println("Value Prev : "+temp.prev.data);
               temp = temp.next;
               length++;
           }
        }
        System.out.println("List Length : " + length);
    }
}
