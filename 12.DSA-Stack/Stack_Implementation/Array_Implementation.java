package Stack_Implementation;

class MyStack1 {
    int st[];
    int top;
    int capacity;

    MyStack1(int c){
        top = -1;
        capacity = c;
        st = new int[capacity];
    }

    void push(int d){
        if(top == capacity-1){
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        st[top] = d;
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }

        int res = st[top];
        top--;

        return res;
    }

    int peek(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }

        return st[top];
    }

    int size(){
        return top+1;
    }

    // Stack will be empty if top = -1.
    boolean isEmpty(){
        return (top == -1);
    }
}

class Array_Implementation {
    public static void main(String[] args) {
        
        MyStack1 st = new MyStack1(5);

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        // st.push(60);

        while(st.isEmpty() != true){
            System.out.println(st.pop());
        }

        System.out.println(st.pop());

        // System.out.println(st.peek());

        // System.out.println(st.isEmpty());
                
    }
}