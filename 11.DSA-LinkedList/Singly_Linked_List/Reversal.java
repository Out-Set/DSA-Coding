package Singly_Linked_List;

public class Reversal {
    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Iterative Reverse
        Node resNode1 = iterRevevSLL(head);
        Traversing.printList(resNode1);


        // Recursive Reverse
        // Node resNode2 = recRevSLL(head);
        // Traversing.printList(resNode2);
    }


    // Iterative Reverse
    static Node iterRevevSLL(Node head){

        Node curr = head;
        Node prev = null;

        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    


    // Recursive Reverse
    static Node recRevSLL(Node head) {

        if(head == null || head.next == null) {
            return head;
        }

        Node rest_head = recRevSLL(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;

        return rest_head;
    }
}
