package Singly_Linked_List;

public class Traversing {
    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Iterative Traversal
        printList(head);
        System.out.println();

        // Recursive Traversal
        recPrint(head);
    }

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
