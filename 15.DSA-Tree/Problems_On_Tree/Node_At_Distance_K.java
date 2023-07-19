package Problems_On_Tree;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class Node_At_Distance_K {
    public static void main(String[] args) {
        
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);


        printKDist(root, 2);
    }


    static void printKDist(Node root, int k) {
        if(root == null){
            return;
        }

        if(k == 0) {
            System.out.println(root.key + " ");
        }

        else{
            printKDist(root.left, k-1);
            printKDist(root.right, k-1);
        }
    }
}
