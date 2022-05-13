import java.util.*;
class Node{
    int data;
    Node next;
}
class LL3{
    Node head;
    public void addLast(int value){
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = null;
        if(head==null)
            head = newNode;
        else{
            Node lastNode = head;
            while(lastNode.next!=null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static void main(String args[]){
        LL3 ll = new LL3();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.addLast(40);
        ll.print();
    }
}