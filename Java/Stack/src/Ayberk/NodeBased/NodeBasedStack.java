package Ayberk.NodeBased;

public class NodeBasedStack {
    StackNode top;

    public boolean isEmpty(){
        return top == null;
    }

    public void push(int data){
        StackNode newNode = new StackNode(data);
        if(top == null){
            top = newNode;
            System.out.println(data + " pushed into stack!");
            return;
        }

        StackNode temp = top;
        top = newNode;
        newNode.next = temp;

        System.out.println(data + " pushed into stack!");
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            System.exit(-1);
        }
        int popped = top.data;
        top = top.next;
        System.out.println(popped + " popped from stack!");
        return popped;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            System.exit(-1);
        }
        return top.data;
    }

    public int size(){
        if(top == null)
            return 0;

        int counter = 0;
        StackNode current = top;

        while(current != null){
            counter++;
            current = current.next;
        }

        return counter;
    }
}
