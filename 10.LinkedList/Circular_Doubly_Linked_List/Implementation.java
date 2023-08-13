package Circular_Doubly_Linked_List;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int d){
        data = d;
        next = null;
        prev = null;
    }
}

public class Implementation {
    public static void main(String[] args) {

        Node head = new Node(10);
        // head.next = head;
        // head.prev = head;

        head.next = new Node(20);

        head.next.next = new Node(30);
        head.next.prev = head;

        head.next.next.next = new Node(40);
        head.next.next.prev = head.next.next;

        head.next.next.next.next = head;

        head.prev = head.next.next.next.next;


        // Traversal
        Traversal.printCDLL(head);        
    }
}
