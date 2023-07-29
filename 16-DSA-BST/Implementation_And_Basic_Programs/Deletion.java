package Implementation_And_Basic_Programs;

public class Deletion {
    public static void main(String[] args) {
        Node root = new Node(20);

        root.left = new Node(10);
        root.right = new Node(30);

        root.left.right = new Node(15);
        root.right.right = new Node(40);

        // Deletion
        delNode(root, 10);
        Traversal.traverse(root);

    }


    // Deletion
    static Node delNode(Node root, int x){
        if(root == null){
            return null;
        }

        else if(root.data<x){
            root.right = delNode(root.right, x);
        }

        else{
            if(root.left == null){
                return root.left;
            }
            else if(root.right == null){
                return root.right;
            }
            else{
                Node succ = getSucc(root);
                root.data = succ.data;
                root.right = delNode(root.right, succ.data);
            }
        }

        return root;
    }

    static Node getSucc(Node root){
        Node curr = root.right;
        while(curr != null && curr.left != null){
            curr = curr.left;
        }

        return curr;
    }
}
