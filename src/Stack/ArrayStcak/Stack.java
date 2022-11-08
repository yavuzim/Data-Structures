package Stack.ArrayStcak;

public class Stack {
    Number[] numbers;
    int top, length;

    public Stack(int length) {
        this.length = length;
        numbers = new Number[this.length];
        this.top = -1;
    }

    int top() {
        if (this.top > -1)
            return this.numbers[this.top].data;
        return -1;
    }

    boolean isFull() {
        if (this.top != this.length - 1)
            return true;
        return false;
    }

    boolean isEmpty() {
        if (this.top > -1)
            return true;
        return false;
    }

    void add(Number number) {
        if (isFull()) {
            int inc = 1;
            this.top += inc;
            this.numbers[this.top] = number;
        }
    }

    void delete() {
        if (isEmpty()) {
            numbers[this.top] = null;
            this.top -= 1;
        }
    }

    void print() {
        for (int i = this.length - 1; i > -1; i--) {
            if (this.numbers[i] == null)
                System.out.println("Index : " + i + "\t Value : null" );
            else if (this.top == i) {
                System.out.println("Index : " + i + "\t Value : " + this.numbers[i].data + "\t <-- Top");
            } else {
                System.out.println("Index : " + i + "\t Value : " + this.numbers[i].data);
            }
        }
    }
}
