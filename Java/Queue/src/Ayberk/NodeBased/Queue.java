package Ayberk.NodeBased;

public class Queue {
    private static Node rear = null, front = null;
    private static int count = 0;

    public int dequeue(){
        if(front == null){
            System.out.println("\nQueue Underflow");
            System.exit(-1);
        }

        Node temp = front;
        System.out.println("Removing " + temp.data + "\n");

        front = front.next;

        if(front == null){
            rear = null;
        }

        count--;

        return temp.data;
    }

    public void enqueue(int data){
        Node node = new Node(data);
        System.out.println("Inserting " + data + "\n");

        if(front == null){
            front = node;
            rear = node;
        }
        else{
            rear.next = node;
            rear = node;
        }

        count++;
    }

    public int peek(){
        if(front == null){
            System.exit(-1);
        }
        return front.data;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public int size(){
        return count;
    }
}
