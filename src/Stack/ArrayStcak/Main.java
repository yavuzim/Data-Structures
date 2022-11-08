package Stack.ArrayStcak;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(8);
        stack.add(new Number(10));
        stack.add(new Number(20));
        stack.add(new Number(30));
        stack.add(new Number(40));
        stack.add(new Number(50));
        stack.print();
        System.out.println("Top Value : " + stack.top());
        System.out.println("--------------");
        stack.delete();
        stack.print();
        System.out.println("Top Value : " + stack.top());
    }
}
