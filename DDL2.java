class Node
{   
    int data;
    Node prev;
    Node next;
}

public class DDL2{
    Node head;
    public void addFirst(int val){
        Node newNode = new Node();
        newNode.data = val;
        if(head == null){
            newNode.prev = null;
            newNode.next = null;
            head = newNode;
        }
        else{
            newNode.prev = null;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void print(){
        Node temp = head;
        Node last = null;
        System.out.println("Forward Traversal");
        while(temp != null)
        {
            System.out.println(temp.data);
            if(temp.next == null)
                last = temp;
            temp = temp.next;
        }
        System.out.println("Backward Traversal");
        temp = last;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
    public static void main(String args[])
    {

        DDL2 ddl = new DDL2();
        ddl.addFirst(10);
        ddl.addFirst(20);
        ddl.addFirst(30);
        ddl.addFirst(40);
        ddl.print();
    }
}