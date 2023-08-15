package Graph_Traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class BFS{
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
        ArrayList<Integer> al = bfsOfGraph(5, adj);
        System.out.println(al);

    }

    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> bfs = new ArrayList<>();

        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for(Integer it: adj.get(node)){
                if(vis[it] == false){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }

        return bfs;        
    }
}