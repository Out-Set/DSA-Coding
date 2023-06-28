package Circular_Singly_Linked_List;

class Node {
    int data;
    Node next;

    Node(int d){
        data = d;
        next = null;
    }
}

public class Implementation {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head.next.next.next.next = head;        
    }
    
}
