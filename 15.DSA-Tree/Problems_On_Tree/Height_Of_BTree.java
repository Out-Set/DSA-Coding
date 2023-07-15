package Problems_On_Tree;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class Height_Of_BTree {
    public static void main(String[] args) {
        
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);


        System.out.println(height(root));
    }


    static int height(Node root) {
        if(root == null){
            return 0;
        }

        else{
            return Math.max(height(root.left), height(root.right))+1;
        }
    }
}
