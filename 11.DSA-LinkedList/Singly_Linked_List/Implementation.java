package Singly_Linked_List;

class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

class Implementation {
    public static void main(String[] args) {
        
        // Creating Nodes
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);

        // Linking Nodes
        head.next = temp1;
        temp1.next = temp2;

        // OR, Simply
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);
        head1.next.next.next.next = new Node(50);
    }
}

class Traversal {

    // Iterative Traversal
    public static void printList(Node head){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    // Recursive Traversal
    public static void recPrint(Node head){

        if(head == null){
            return;
        }
        
        System.out.print(head.data + " ");
        recPrint(head.next);
    }
}

