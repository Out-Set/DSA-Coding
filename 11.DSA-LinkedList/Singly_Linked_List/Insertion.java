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
        insertAtEnd(head, 45);
        Traversing.printList(head);


        // Insert at the Given Position
        Node n = insertAtGivenPos(head, 2, 50);
        Traversing.printList(n);
    }

    // Insert at Beginning
    static void insertBegin(Node head, int data){

        Node temp = new Node(data);
        temp.next = head;
        
        Traversing.printList(temp);
    }


    // Insert at the End
    static void insertAtEnd(Node head, int data){

        Node temp = new Node(data);

        // If head==null
        if(head == null){
            head = new Node(data);
            return;
        }

        temp.next = null;

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;

        return;
    }


    // Insert at the Given Position
    static Node insertAtGivenPos(Node head, int pos, int data){

        Node temp = new Node(data);

        // If head==null
        if(pos == 1){
            temp.next = head;
            return temp;
        }

        Node curr = head;
        for(int i=1; i<pos-2 && curr != null; i++){
            curr = curr.next;
        }

        if(curr == null){
            return head;
        }
        temp.next = curr.next;
        curr.next = temp;

        return head;
    }
}
