class Node{
    int data;
    Node prev, next;
}
class DoubleLinkedList{
    public static void main(String args[]){
        Node head, middle, tail;
        head = new Node();
        middle = new Node();
        tail = new Node();
        head.data = 10;
        middle.data = 20;
        tail.data = 30;
        head.prev = null;
        head.next = middle;
        middle.prev = head;
        middle.next = tail;
        tail.prev = middle;
        tail.next = null;
        System.out.println("Forward Traversal");
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("Backward Traversal");
        temp = tail;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
}