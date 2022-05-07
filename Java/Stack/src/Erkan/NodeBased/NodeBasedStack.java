package Erkan.NodeBased;

public class NodeBasedStack {
    private StackNode top;

    public void push(int data){
        StackNode newNode = new StackNode(data);
        if(isEmpty()){
            top = newNode;
        }
        else{
            StackNode temp = top;
            top = newNode;
            top.next = temp;
        }

        System.out.println(data + " pushed into stack");
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            System.exit(-1);
        }
        int answer = top.data;
        top = top.next;
        System.out.println(answer + " popped from stack");
        return answer;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack Underflow!");
            System.exit(-1);
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
