public class Main {
    public static void main(String[] args) {
//        LinkedList<Integer> linkedList = new LinkedList<Integer>();
//        linkedList.append(1);
//        linkedList.append(5);
//        linkedList.append(10);
//        linkedList.append(20);
//        linkedList.append(30);
//        linkedList.prepend(40);
//        linkedList.prepend(50);
//        linkedList.delete(10);
//        System.out.println(linkedList.contains(55));
//        System.out.println(linkedList.contains(20));
//        System.out.println(linkedList.contains(10));
//        System.out.println(linkedList.size());
//        //linkedList.clear();
//        System.out.println(linkedList.size());
//        linkedList.append(10);
//        System.out.println(linkedList.size());
//        System.out.println(linkedList.get(4));

//
//        LinkedList<String> linkedList1 = new LinkedList<String>();
//        linkedList1.append("Ayberk");
//        linkedList1.append("Erkan");
//        linkedList1.append("Mustafa");
//        linkedList1.append("Ayşe");
//        System.out.println(linkedList1.contains("Erkan"));
//        linkedList1.delete("Erkan");
//        System.out.println(linkedList1.contains("Erkan"));

        LinkedList<Integer> linkedList = new LinkedList<>();

        for(int i = 0; i<10; i++){
            linkedList.append(i);
            if(i % 2 == 0)
                linkedList.append(i+2);
        }

        linkedList.print();
        linkedList.removeDuplicates();
        linkedList.print();
    }
}
