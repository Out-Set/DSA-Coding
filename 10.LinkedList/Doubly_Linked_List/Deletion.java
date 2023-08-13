package Doubly_Linked_List;

public class Deletion {
    public static void main(String[] args) {
        
        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        head.next = n2;
        n2.prev = head;
        n2.next = n3;
        n3.prev = n2;

        // Delete Head
        Node n = delHead(head);
        Traversal.printDll(n);


        // Delete Last
        Node n1 = delLast(head);
        Traversal.printDll(n1);
    }


    // Delete Head of DLL
    static Node delHead(Node head){
        if(head == null){
            return null;
        }

        // If there is only one Node
        if(head.next == null){
            return null;
        }
        else{
            head = head.next;
            head.prev = null;

            return head;
        }
    }


    // Delete Last of DLL
    static Node delLast(Node head){
        if(head == null){
            return null;
        }

        // If there is only one Node
        if(head.next == null){
            return null;
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }

        curr.prev.next = null;

        return head;
    }
}
