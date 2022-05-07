public class LinkedList<Dev.Student> {
    private Node head;
    private int size = 0;

    public void append(Student data) {
        (Dev.Student)
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

    public void prepend(Student data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void delete(Student data) {
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

    public boolean contains(Student data) {
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

    public Student get(int index) {
        if(index > size && index < 0){
            return null;
        }
        Node current = head;
        for(int i = 0; i<index; i++){
            current = current.next;
        }

        return (Student)current.data;
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
                    size--;
                }
                repeated = repeated.next;
            }
            current = current.next;
        }
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
}