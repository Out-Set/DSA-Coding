package Traversal;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
    }
}

public class Depth_First_Traversal {
    public static void main(String[] args) {
        
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);

        // In-order Traversal
        System.out.println("Inorder Traversal");
        inOrder(root);

        // Pre-order Traversal
        System.out.println("Preorder Traversal");
        preOrder(root);

        // Post-order Traversal
        System.out.println("Postorder Traversal");
        postOrder(root);
    }


    // In-order Traversal
    static void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.key + " ");
            inOrder(root.right);
        }
    }


    // Pre-order Traversal
    static void preOrder(Node root){
        if(root != null){
            System.out.println(root.key + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }


    // Post-order Traversal
    static void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.println(root.key + " ");
        }
    }
}
