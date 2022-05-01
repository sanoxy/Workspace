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

    public T get(int index) {
        if(index > size && index < 0){
            return null;
        }
        Node current = head;
        for(int i = 0; i<index; i++){
            current = current.next;
        }

        return (T)current.data;
    }

    public void removeDuplicates(){
        if(head == null)
            return;
        Node current = head;

        while(current != null){
            Node repeated = current;
            while(repeated != null && repeated.next != null){
                if(current.data == repeated.next.data){
                    repeated.next = repeated.next.next;
                }
                repeated = repeated.next;
            }
            current = current.next;
        }
    }

    public void printMiddle(){
        if (head == null){
            return;
        }
        Node current = head;
        Node mid = head;

        while (current != null && current.next != null){
            current = current.next.next;
            mid = mid.next;
        }
        System.out.println(mid.data);
    }

    public void print(){
        if(head == null)
            return;

        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void reverseK(){
        /*
            Input:
            LinkedList: 1->2->2->4->5->6->7->8    K = 4
            Output: 4 2 2 1 8 7 6 5

            Explanation:
            The first 4 elements 1,2,2,4 are reversed first
            and then the next 4 elements 5,6,7,8. Hence, the
            resultant linked list is 4->2->2->1->8->7->6->5.
         */
    }
}