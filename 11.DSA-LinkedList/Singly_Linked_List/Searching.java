package Singly_Linked_List;

public class Searching {
    
    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Iterative Search
        System.out.println(iterSearch(head, 30));

        // Recursive Search
        System.out.println(recSearch(head, 20));

    }


    // Iterative Search
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


    // Recursive Search
    static int recSearch(Node head, int x){
        if(head == null){
            return -1;
        }

        if(head.data == x){
            return 1;
        }
        else{
            int pos = recSearch(head.next, x);

            if(pos == -1){
                return -1;
            }
            else{
                return pos+1;
            }
        }
    }
}
