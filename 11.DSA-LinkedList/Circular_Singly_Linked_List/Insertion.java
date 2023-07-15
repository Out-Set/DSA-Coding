package Circular_Singly_Linked_List;

public class Insertion {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head.next.next.next.next = head;


        // Insertion At the Beginning
        Node n = insertAtBegin(head, 05);
        Traversal.printList(n);

        // Insertion At the End
        Node n1 = insertAtEnd(head, 50);
        Traversal.printList(n1);
    }

    // Insertion At the Beginning
    static Node insertAtBegin(Node head, int data){

        Node temp = new Node(data);

        if(head == null){
            return null;
        }

        temp.next = head.next;
        head.next = temp;

        // Swap data of head and temp
        int t = temp.data;
        temp.data = head.data;
        head.data = t;

        return head;        
    }


    // Insertion At the End
    static Node insertAtEnd(Node head, int data){

        Node temp = new Node(data);

        if(head == null){
            return null;
        }

        temp.next = head.next;
        head.next = temp;

        // Swap data of head and temp
        int t = temp.data;
        temp.data = head.data;
        head.data = t;

        return temp; 
    }
}
