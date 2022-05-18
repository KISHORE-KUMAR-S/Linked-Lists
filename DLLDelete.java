class Node{
    int data;
    Node prev, next;
}
public class DLLDelete{
    Node head;
    public void addLast(int val){
        Node newNode = new Node();
        newNode.data = val;
        if(head==null){
            newNode.prev = null;
            newNode.next = null;
            head = newNode;
        }
        else{
            Node last = head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
            newNode.prev = last;
            newNode.next = null;
        }
    }
    public void del(int key){
        if(head==null)
            return;
        Node temp = head;
        while(temp != null && temp.data != key){
            temp = temp.next;
        }
        if(temp==null)
            System.out.println("Key not found");
        else if(temp == head){
            head = head.next;
            head.prev = null;
        }
        else{
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }
    public void print(){
        Node temp = head;
        Node last = null;
        System.out.println("Forward Traversal");
        while(temp!=null){
            System.out.println(temp.data);
            if(temp.next == null)
                last = temp;
            temp = temp.next;
        }
        System.out.println("Backward Traversal");
        temp = last;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.prev;
        }
    }
    public static void main(String args[]){
        DLLDelete dll = new DLLDelete();
        dll.addLast(1);
        dll.addLast(10);
        dll.addLast(15);
        dll.addLast(100);
        dll.print();
        System.out.println("After Deletion:");
        dll.del(15);
        dll.print();
    }
}