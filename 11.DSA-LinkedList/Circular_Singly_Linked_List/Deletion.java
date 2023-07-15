package Circular_Singly_Linked_List;

public class Deletion {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head.next.next.next.next = head;


        // Delete Head
        Node n = delHead(head);
        Traversal.printList(n);


        // Delete Last
        // Node n1 = delLast(head);
        // Traversal.printList(n1);
        

        // Delete Kth Node
        // Node n2 = delKthNode(head, 3);
        // Traversal.printList(n2);
    }


    // Delete Head
    static Node delHead(Node head){

        // When head having null
        if(head == null){
            return null;
        }

        // When only one head
        if(head.next == head){
            return null;
        }

        Node curr = head;
        while(curr.next != head){
            curr = curr.next;
        }

        curr.next = head.next;

        return curr.next;
    }


    // Delete Last
    static Node delLast(Node head){

        // When head having null
        if(head == null){
            return null;
        }

        // When only one head
        if(head.next == head){
            return null;
        }

        Node curr = head;
        while(curr.next.next != head){
            curr = curr.next;
        }

        curr.next = head;

        return head;
    }



    // Delete Kth Node
    static Node delKthNode(Node head, int k) {
        if(head == null) {
            return null;
        }

        if(k == 1) {
            return Deletion.delHead(head);
        }

        Node curr = head;
        for(int i=0; i<k-2; i++){
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}
