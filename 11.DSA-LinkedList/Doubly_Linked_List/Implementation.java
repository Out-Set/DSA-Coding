package Doubly_Linked_List;

class Node{
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
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        head.next = n2;
        n2.prev = head;
        n2.next = n3;
        n3.prev = n2;
    }
}
