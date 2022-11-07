package PolynomialApp;

public class Main {
    public static void main(String[] args) {
        Polynomial polynomial = new Polynomial();
        polynomial.add(new Node(2,5));
        polynomial.add(new Node(3,2));
        polynomial.add(new Node(1,2));
        polynomial.add(new Node(1,5));
        polynomial.add(new Node(2,1));
        polynomial.add(new Node(4,0));
        polynomial.print();
    }
}
