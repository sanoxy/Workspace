package Ayberk.ArrayBased;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int data) {
        if(isFull()){
            System.out.println("Ayberk.ArrayBased.Stack Overflow!\n");
            System.exit(-1);
        }

        System.out.println("Inserting: " + data);
        arr[++top] = data;
    }

    public int pop() {
        if(isEmpty()){
            System.out.println("Ayberk.ArrayBased.Stack Underflow");
            System.exit(-1);
        }
        System.out.println("Removing " + peek());
        return arr[top--];
    }

    public int peek() {
        if(!isEmpty()){
            return arr[top];
        }
        else{
            System.out.println("Ayberk.ArrayBased.Stack Underflow!\n");
            System.exit(-1);
        }
        return -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }
}
