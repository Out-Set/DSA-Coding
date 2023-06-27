package Doubly_Linked_List;

public class ReverseDll {
    public static void main(String[] args) {
        
        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        head.next = n2;
        n2.prev = head;
        n2.next = n3;
        n3.prev = n2;

        // Reversal Of DLL
        Node n = reverseDLL(head);
        Traversal.printDll(n);
    }

    static Node reverseDLL(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node prev = null;
        Node curr = head;

        while(curr != null){
            // Swap prev and next
            prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;

            curr = curr.prev;
        }

        return prev.prev;
    }
}
