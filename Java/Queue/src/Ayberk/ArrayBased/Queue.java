package Ayberk.ArrayBased;

public class Queue {
    private int capacity;
    private int queueArray[];
    private int front = 0;
    private int rear = -1;
    private int currentSize = 0;

    public Queue(int queueSize){
        this.capacity = queueSize;
        this.queueArray = new int[this.capacity];
    }

    public void enqueue(int item){
        if(isQueueFull()){
            System.out.println("Overflow state. Increasing capacity!");
            increaseCapacity();
            enqueue(item);
        }
        else{
            rear++;
            queueArray[rear] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue");
        }
    }

    public void dequeue(){
        if(isQueueEmpty()){
            System.out.println("Underflow State!");
        }
        else{
            front++;
            System.out.println("Removed element: " + queueArray[front-1]);


            currentSize--;
        }
    }

    public boolean isQueueFull(){
        return currentSize == capacity;
    }

    public boolean isQueueEmpty(){
        return currentSize == 0;
    }

    private void increaseCapacity(){
        int newCapacity = this.queueArray.length * 2;
        int[] newArr = new int[newCapacity];

        int tmpFront = front;
        int index = -1;

        while(true){
            newArr[++index] = this.queueArray[tmpFront];
            tmpFront++;
            if(tmpFront == this.queueArray.length){
                tmpFront = 0;
            }
            if(currentSize == index+1)
                break;
        }

        //newArr = Arrays.copyOfRange(this.queueArray,this.front,this.rear);

        this.queueArray = newArr;
        System.out.println("New array capacity: " + this.queueArray.length);
        this.front = 0;
        this.rear = index;
        this.capacity = this.queueArray.length;
    }


}
