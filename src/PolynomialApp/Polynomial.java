package PolynomialApp;

public class Polynomial {
    Node head, tail;

    public Polynomial() {
        this.head = null;
        this.tail = null;
    }

    protected void add(Node data) {
        if (this.head == null) {
            this.head = data;
            this.tail = data;
        } else {
            Node temp = this.head;
            Node before = null;
            if (data.coef != 0) {
                if (temp.exponent < data.exponent) {
                    data.next = temp;
                    this.head = data;
                } else if (temp.exponent == data.exponent) {
                    temp.coef += data.coef;
                } else {
                    while ((temp != null) && (temp.exponent >= data.exponent)) {
                        before = temp;
                        temp = temp.next;
                    }
                    if (before.exponent == data.exponent) {
                        before.coef += data.coef;
                    } else {
                        data.next = before.next;
                        before.next = data;
                    }
                }
            }
        }
    }

    protected void print() {
        Node temp = this.head;
        System.out.println("HEAD -> " + this.head.coef + "^" + this.head.exponent + "\t TAIL -> " + this.tail.coef + "^" + this.tail.exponent);
        if (temp != null)
            System.out.print("P(x) = ");
        while (temp != null) {
            if (temp.exponent > 1) {
                if (temp.next != null) System.out.print(temp.coef + "x^" + temp.exponent + " + ");
                else System.out.print(temp.coef + "x^" + temp.exponent);
            } else if (temp.exponent == 1) {
                if (temp.next != null) System.out.print(temp.coef + "x + ");
                else System.out.print(temp.coef + "x");
            } else {
                System.out.print(temp.coef);
            }
            temp = temp.next;
        }
    }
}
