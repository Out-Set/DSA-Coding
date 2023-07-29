package Implementation_And_Basic_Programs;

public class Insertion {
    public static void main(String[] args) {
        Node root = new Node(20);

        root.left = new Node(10);
        root.right = new Node(30);

        root.left.right = new Node(15);
        root.right.right = new Node(40);

        // Recursive Insert
        recursiveInsert(root, 5);
        Traversal.traverse(root);

        // Iterative Insert
        iterativeInsert(root, 60);
        Traversal.traverse(root);
    }

    // Recursive Insert
    static Node recursiveInsert(Node root, int x){
        if(root == null){
            return new Node(x);
        }

        if(root.data>x){
            root.left = recursiveInsert(root.left, x);
        }
        else if(root.data<x){
            root.right = recursiveInsert(root.right, x);
        }

        return root;
    }


    // Iterative Insert
    static Node iterativeInsert(Node root, int x){
        Node temp = new Node(x);
        Node parent = null;
        Node curr = root;

        while(curr != null){
            parent = curr;

            if(curr.data>x){
                curr = curr.left;
            }
            else if(curr.data<x){
                curr = curr.right;
            }
            else{
                return root;
            }
        }

        if(parent == null){
            return temp;
        }

        if(parent.data>x){
            parent.left = temp;
        }

        else{
            parent.right = temp;
        }

        return root;
    }
}
