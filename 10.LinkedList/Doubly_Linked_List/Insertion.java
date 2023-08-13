package Doubly_Linked_List;

public class Insertion {
    public static void main(String[] args) {
        
        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        head.next = n2;
        n2.prev = head;
        n2.next = n3;
        n3.prev = n2;

        // Insertion At the Beginning
        Node n = insertAtBegin(head, 05);
        Traversal.printDll(n);

        // Insertion At the End
        Node n1 = insertAtEnd(head, 40);
        Traversal.printDll(n1);
    }


    // Insertion At the Beginning
    static Node insertAtBegin(Node head, int data){

        Node temp = new Node(data);

        temp.next = head;
        if(head != null){
            head.prev = temp;
        }

        return temp;
    }


    // Insertion At the End
    public static Node insertAtEnd(Node head, int data){

        Node temp = new Node(data);

        if(head == null){
            return temp;
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }

        curr.next = temp;
        temp.prev = curr;

        return head;        
    }
}
