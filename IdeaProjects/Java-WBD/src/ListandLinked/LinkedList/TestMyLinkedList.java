package ListandLinked.LinkedList;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("====TESTING====");
        MyLinkedList II = new  MyLinkedList(10);
        II.addFirst(11);
        II.addFirst(12);
        II.addFirst(13);

        II.add(4,9);
        II.add(4,9);
        II.printList();
    }
}
