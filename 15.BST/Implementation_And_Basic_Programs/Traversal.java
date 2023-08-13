package Implementation_And_Basic_Programs;

public class Traversal {
    
    public static void traverse(Node root){
        if(root != null){
            traverse(root.left);
            System.out.print(root.data + " ");
            traverse(root.right);
        }
    }
}
