package Graph_Traversal;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {

        int n = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(n);

        // n+1
        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<Integer>());
        }

        Graph_Representation.Adjacency_List.addEdge(adj, 0, 1);
        Graph_Representation.Adjacency_List.addEdge(adj, 0, 2);
        Graph_Representation.Adjacency_List.addEdge(adj, 0, 3);
        Graph_Representation.Adjacency_List.addEdge(adj, 2, 4);

        System.out.println("Current Graph is: ");
        Graph_Representation.Adjacency_List.printGraph(adj);

        System.out.println("Result of Graph traversal: ");
        ArrayList<Integer> al = dfsOfGraph(n, adj);
        System.out.println(al);
    }

    public static ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        ArrayList<Integer> ls = new ArrayList<Integer>();
        boolean []vis = new boolean[V];
        vis[0] = true;
        
        dfs(0, adj, ls, vis);
        
        return ls;
    }
    

    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls, boolean []vis){
        
        vis[node] = true;
        ls.add(node);
        
        for(Integer it: adj.get(node)){
            if(vis[it] == false){
                dfs(it, adj, ls, vis);
            }
        }
    }
}
