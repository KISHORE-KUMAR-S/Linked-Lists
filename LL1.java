import java.util.*;
class Node{
    int data;
    Node next;
}
public class LL1{
    public static void main(String args[]){
        Node head, middle, tail;
        head = new Node();
        middle = new Node();
        tail = new Node();
        head.data = 10;
        middle.data = 20;
        tail.data = 30;
        head.next = middle;
        middle.next = tail;
        tail.next = null;
        System.out.println("The Linked List elements are: ");
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}