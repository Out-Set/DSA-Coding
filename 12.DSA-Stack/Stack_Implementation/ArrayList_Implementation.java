package Stack_Implementation;

import java.util.ArrayList;

class MyStack2 {
    ArrayList<Integer> st = new ArrayList<>();
    int top;

    MyStack2(){
        top = -1;
    }

    void push(int d){
        top++;
        st.add(d);
    }

    int pop(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }

        top--;
        int item = st.remove(st.size()-1);
        return item;
    }

    int peek(){
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }

        return st.get(st.size()-1);
    }

    boolean isEmpty(){
        return (st.isEmpty());
    }

    int size(){
        return st.size();
    }

}

public class ArrayList_Implementation {
    public static void main(String[] args) {
        MyStack2 st = new MyStack2();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.size());
        System.out.println(st.peek());

        System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.peek());

        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

    }
}
