package Questions.MaxStack;

public class Main {
    public static void main(String[] args) {
        MaxStack myStack = new MaxStack();

        myStack.push(6);
        myStack.getMax();

        myStack.push(7);
        myStack.getMax();

        myStack.push(8);
        myStack.getMax();

        myStack.push(5);
        myStack.getMax();

        myStack.push(3);
        myStack.getMax();

        myStack.pop();
        myStack.getMax();

        myStack.push(10);
        myStack.getMax();

        myStack.pop();
        myStack.getMax();

        myStack.pop();
        myStack.getMax();
    }
}
