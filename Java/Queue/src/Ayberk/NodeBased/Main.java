package Ayberk.NodeBased;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
        }

        System.out.println("The front element is: " + queue.peek());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("The front element is: " + queue.peek());

        if (queue.isEmpty()) {
            System.out.println("The queue is empty!");
        } else {
            System.out.println("Queue is not empty!");
        }

        System.out.println();
    }
}
