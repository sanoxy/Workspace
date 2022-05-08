package Questions.MinStack;

import java.util.Objects;
import java.util.Stack;

public class MaxStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    public MaxStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int data) {
        mainStack.push(data);
        if (minStack.size() == 0 || minStack.peek() > data)
            minStack.push(data);
    }

    public void pop() {
        if (minStack.size() != 0 && Objects.equals(mainStack.peek(), minStack.peek()))
            minStack.pop();
        mainStack.pop();
    }

    public void getMax() {
        System.out.println(minStack.peek());
    }
}
