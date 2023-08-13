package Doubly_Linked_List;

public class Searching {
    public static void main(String[] args) {
        
        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        head.next = n2;
        n2.prev = head;
        n2.next = n3;
        n3.prev = n2;

        // Searching in DLL
        System.out.println(iterSearch(head, 20));

    }


    // Searching in DLL
    static int iterSearch(Node head, int x){

        int pos = 1;
        Node curr = head;

        while(curr != null){
            if(curr.data == x){
                return pos;
            }
            else{
                pos++;
                curr = curr.next;
            }
        }

        return -1;
    }
}
