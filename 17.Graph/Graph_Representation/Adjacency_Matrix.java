package Graph_Representation;

class AAdjacency_Matrixd {
    public static void main(String[] args) {

        int n = 3;
        int m = 3;

        // Un-Directed Graph
        int adj1[][] = new int[n+1][m+1];
        System.out.println("Un-Directed Graph: ");
        UnDirGraph(adj1, n, m);

        // Directed Graph
        int adj2[][] = new int[n+1][m+1];
        System.out.println("Directed Graph: ");
        DirGraph(adj2, n, m);        
    }

    static void UnDirGraph(int[][] adj, int n, int m){

        // edge 1--2
        adj[1][2] = 1;
        adj[2][1] = 1;

        // edge 2--3
        adj[2][3] = 1;
        adj[3][2] = 1;

        // edge 1--3
        adj[1][3] = 1;
        adj[3][1] = 1;

        // edge u--v
        // adj[u][v] = 1;
        // adj[v][u] = 1;


        // Print 
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void DirGraph(int[][] adj, int n, int m){

        // edge 1--2
        adj[1][2] = 1;
        // adj[2][1] = 1;

        // edge 2--3
        adj[2][3] = 1;
        // adj[3][2] = 1;

        // edge 1--3
        adj[1][3] = 1;
        // adj[3][1] = 1;

        // edge u--v
        // adj[u][v] = 1;
        // adj[v][u] = 1;


        // Print 
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
    }
}