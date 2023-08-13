package Circular_Doubly_Linked_List;

public class Insertion {
    public static void main(String[] args) {

        Node head = new Node(10);
        // head.next = head;
        // head.prev = head;

        head.next = new Node(20);

        head.next.next = new Node(30);
        head.next.prev = head;

        head.next.next.next = new Node(40);
        head.next.next.prev = head.next.next;

        head.next.next.next.next = head;

        head.prev = head.next.next.next.next;


        // Insertion At the Beginning/Head
        Node n1 = insertAtBegin(head, 5);
        Traversal.printCDLL(n1);

        // Insertion At the End
        Node n2 = insertAtBegin(head, 45);
        Traversal.printCDLL(n2);

    }


    // Insertion At the Beginning/Head
    static Node insertAtBegin(Node head, int data) {

        Node temp = new Node(data);
        if(head == null){
            temp.next = temp;
            temp.prev = temp;
            return temp;
        }

        temp.prev = head.next;
        temp.next = head;

        head.prev.next = temp;
        head.prev = temp;

        return temp;
    }


    // Insertion At the End
    static Node insertAtEnd(Node head, int data) {
        
        Node temp = new Node(data);
        if(head == null){
            temp.next = temp;
            temp.prev = temp;
            return temp;
        }

        temp.prev = head.next;
        temp.next = head;

        head.prev.next = temp;
        head.prev = temp;

        return head;
    }
}
