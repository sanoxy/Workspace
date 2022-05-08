package Questions.MaxStack;

import java.util.Stack;

public class MaxStack {
    private Stack<Integer> maxStack;
    private Stack<Integer> mainStack;

    MaxStack(){
        maxStack = new Stack<Integer>();
        mainStack = new Stack<Integer>();
    }

    public void push(int data){
        mainStack.push(data);
        if(maxStack.size() == 0 || maxStack.peek()<mainStack.peek()){
            maxStack.push(data);
        }
    }

    public void pop(){
        if(mainStack.pop() == maxStack.peek())
            maxStack.pop();
    }

    public void getMax(){
        System.out.println(maxStack.peek());
    }
}
