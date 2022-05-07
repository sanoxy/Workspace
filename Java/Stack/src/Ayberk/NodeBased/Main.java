package Ayberk.NodeBased;

import Ayberk.ArrayBased.Stack;

public class Main {
    public static void main(String[] args) {
        NodeBasedStack stack = new NodeBasedStack();

        stack.push(1);
        stack.push(2);

        stack.pop(); //2
        stack.pop(); //1
        stack.push(3);

        System.out.println("Top element of stack: " + stack.peek());
        System.out.println("Size of Ayberk.ArrayBased.Stack: " + stack.size());
        stack.pop();

        if(stack.isEmpty())
            System.out.println("The stack is empty!");
        else
            System.out.println("The stack is not empty!");
    }
}
