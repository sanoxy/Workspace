package LinkedList;

public class LinkedList<T> {
    private Node head;
    private int size = 0;

    public void append(T data) {
        if (head == null) {
            head = new Node(data);
            size++;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data);
        size++;
    }

    public void prepend(T data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void delete(T data) {
        if (head == null) {
            return;
        } else if (head.data == data) {
            head = head.next;
            size--;
            return;
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.next.data == data) {
                    current.next = current.next.next;
                    size--;
                    return;
                }
                current = current.next;
            }
        }
    }

    public boolean contains(T data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void clear() {
        size = 0;
        head = null;
    }

    public int size() {
        return size;
    }

    public int get(int index) {
        if(index > size && index < 0){
            return Integer.MIN_VALUE;
        }
        Node current = head;
        for(int i = 0; i<index; i++){
            current = current.next;
        }

        return (int) current.data;
    }

    public void removeDuplicates(){
        //2-2-3-5-9-9
        //2-3-5-9
    }
}
