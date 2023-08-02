package Problems_On_BST;

import java.util.ArrayList;

class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data = d;
        left=right=null;
    }
}

public class Floor_In_BST {
    public static void main(String[] args) {
        Node root = new Node(20);

        root.left = new Node(10);
        root.right = new Node(30);

        root.left.right = new Node(15);
        root.right.right = new Node(40);

        ArrayList<Integer> al = new ArrayList<>();

        floor(root, 10, al);

        System.out.println(al);

    }

    static void floor(Node root, int x, ArrayList<Integer> al){

        while(root != null){
            if(root.data == x){
                al.add(x);
            }
            else if(root.data > x){
                root = root.left;
                al.add(root.data);
            }
            else{
                root = root.right;
                al.add(root.data);
            }
        }
    }
}
