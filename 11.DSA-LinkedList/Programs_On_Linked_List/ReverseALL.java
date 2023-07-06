package Programs_On_Linked_List;

public class ReverseALL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Reverse Linked List
        Node h = revLinkedList(head);

        Node curr = h;
        while(curr.next != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }


    static Node revLinkedList(Node head){

        if(head == null) {
            return null;
        }
        
        Node curr = head;
        while(curr.next != null) {
            int t = curr.data;
            curr.data = curr.next.data;
            curr.next.data = t;

            curr = curr.next;
        }

        return head;
    }
}
