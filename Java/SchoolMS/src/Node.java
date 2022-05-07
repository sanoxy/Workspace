public class Node<Student> {
    Student data;
    Node<Student> next;

    public Node(Student data) {
        this.data = data;
        this.next = null;
    }
}
