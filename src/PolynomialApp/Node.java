package PolynomialApp;

public class Node {
    int coef, exponent;
    Node next;

    public Node(int coef, int exponent) {
        this.coef = coef;
        this.exponent = exponent;
        this.next = null;
    }
}
