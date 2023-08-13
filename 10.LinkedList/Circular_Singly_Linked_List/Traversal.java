package Circular_Singly_Linked_List;

public class Traversal {
    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head.next.next.next.next = head;

        // Traversal Through Iteration
        printList(head);

        // Traversal Through Recursion
        // printListRec(head);
    }

    // Traversal Through Iteration
    static void printList(Node head){

        if(head == null){
            return;
        }

        Node curr = head;
        do{
            System.out.println(curr.data + " ");
            curr = curr.next;
        }
        while(curr != head);
    }

    // Traversal Through Recursion
    static void printListRec(Node head){

        
    }
}
