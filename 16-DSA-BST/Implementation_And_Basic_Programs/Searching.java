package Implementation_And_Basic_Programs;

class Node{
    int data;
    Node left;
    Node right;
    Node(int d){
        data = d;
        left = right = null;
    }
}

class Searching {
    public static void main(String[] args) {
        Node root = new Node(20);

        root.left = new Node(10);
        root.right = new Node(30);

        root.left.right = new Node(15);
        root.right.right = new Node(40);

        // Recursive Search
        System.out.println(recursiveSearch(root, 50));
        System.out.println(recursiveSearch(root, 15));

        // Iterative Search
        System.out.println(iterativeSearch(root, 50));
        System.out.println(iterativeSearch(root, 15));
    }


    // Recursive Search
    static boolean recursiveSearch(Node root, int d){

        if(root == null){
            return false;
        }

        else if(root.data == d){
            return true;
        }

        else if(d<root.data){
            return recursiveSearch(root.left, d);
        }

        else {
            return recursiveSearch(root.right, d);
        }
    }


    // Iterative Search
    static boolean iterativeSearch(Node root, int x){
        while(root != null){
            if(root.data == x){
                return true;
            }
            else if(root.data<x){
                root = root.right;
            }
            else{
                root = root.left;
            }
        }

        return false;
    }
}