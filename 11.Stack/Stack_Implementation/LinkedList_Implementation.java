package Stack_Implementation;

class Node {
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

class MyStack3 {

    Node head;
            // Overflow
    int size;

    MyStack3(){
        head = null;
        size = 0;
    }

    void push(int x){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop(){

        if(head == null){
            // Underflow
            return Integer.MAX_VALUE;
        }

        int res = head.data;
        Node temp = head;
        head = head.next;
        size--;
        return res;
    }

    int peek(){
        if(head == null){
            return Integer.MAX_VALUE;
        }
        return head.data;
    }

    int size(){
        return size;
    }

    boolean isEmpty(){
        return (head == null);
    }
}

class LinkedList_Implementation {
    public static void main(String[] args) {
        
        MyStack3 st = new MyStack3();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.pop());

        System.out.println(st.size());

        System.out.println(st.peek());

        System.out.println(st.isEmpty());

    }
}