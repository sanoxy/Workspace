package Erkan.ArrayBased;

public class Stack {
    private int top;
    private int capacity;
    private int[] arr;

    Stack(int size){
        top = -1;
        arr = new int[size];
        capacity = size;
    }

    public void push(int data){
        if (isFull()){
            System.out.println("Stack Overflow");
            System.exit(-1);
        }
        System.out.println("Inserting: " + data);

        arr[++top] = data;
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
            System.exit(-1);
        }
        return arr[top];
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack Underflow");
            System.exit(-1);
        }
        System.out.println("Removing: " + peek());
        return arr[top--];
    }

    public int size(){
        return top + 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return capacity == top + 1;
    }
}
