package Programs_On_Linked_List;

class Node {
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

class DetectLoopsInLL {
    public static void main(String[] args) {
        
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = head.next;

        // Floyd's Cycle Detection
        detectLoopInLL(head);
        
    } 
    
    // Floyd's Cycle Detection
    static boolean detectLoopInLL(Node head){

        if(head == null){
            return false;
        }
        
        Node slow = head, fast = head;

        while(slow != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                System.out.println("Loop here");
                return true;
            }
        }
        return false;
    }
}
