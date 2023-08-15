package Graph_Representation;

import java.util.ArrayList;

public class Adjacency_List {
    public static void main(String[] args) {
        
        int n = 3;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n);

        // n+1
        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<Integer>());
        }

        // Add-Edges
        // adj.get(u).add(v);
        // adj.get(v).add(u);  // For Directed-Graph comment this line

        // // edge 1--2
        // adj.get(1).add(2);
        // adj.get(2).add(1);

        // // edge 2--3
        // adj.get(2).add(3);
        // adj.get(3).add(2);

        // // edge 1--3
        // adj.get(1).add(3);
        // adj.get(3).add(1);

        // printGraph(adj);


        // Either do manually as mentioned above or through using functions: addEdge & printGraph
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        printGraph(adj);
    }


    // AddEdge Function
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v){
        adj.get(u).add(v);
        adj.get(v).add(u); // For Directed-Graph comment this line
    }


    // Print-Graph
    public static void printGraph(ArrayList<ArrayList<Integer>> adj){
        for(int i=0; i<adj.size(); i++){
            for(int j=0; j<adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
