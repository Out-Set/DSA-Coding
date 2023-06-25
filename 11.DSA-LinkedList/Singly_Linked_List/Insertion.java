package Singly_Linked_List;

public class Insertion {
    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Insert at Beginning
        insertBegin(head, 05);

        

        // Insert at the End

        // Insert at the Given Position
    }

    // Insert at Beginning
    static void insertBegin(Node head, int data){

        Node temp = new Node(data);
        temp.next = head;
        
        Traversing.printList(temp);
    }


    // Insert at the End


    // Insert at the Given Position
}
