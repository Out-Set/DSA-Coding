package Singly_Linked_List;

public class Deletion {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Delete Head Node
        Node n = delHead(head);
        Traversing.printList(n);

        // Delete Last Node
        Node n1 = delLastNode(head);
        Traversing.printList(n1);
        
    }


    // Delete Head Node
    static Node delHead(Node head){

        if(head == null){
            return head;
        }

        head = head.next;

        return head;
    }

    // Delete Last Node
    static Node delLastNode(Node head){

        if(head == null){
            return null;
        }

        Node curr = head;
        while(curr.next != null){

            curr = curr.next;
        }

        curr = null;

        return head;
    }
    
}

