import java.util.*;
class Node{
    int data;
    Node next;
}
class LL2{
    Node head;
    public void addFirst(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        System.out.println("Values are: ");
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String args[]){
        LL2 ll = new LL2();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.print();
    }
}
