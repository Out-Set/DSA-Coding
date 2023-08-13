package Doubly_Linked_List;

public class Traversal {
    public static void main(String[] args) {
        
        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        head.next = n2;
        n2.prev = head;
        n2.next = n3;
        n3.prev = n2;

        // Traversal
        printDll(head);
    }

    public static void printDll(Node head){

        if(head == null){
            System.out.println("Empty DLL");
            return;
        }

        Node curr = head;
        while(curr != null){

            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
}
