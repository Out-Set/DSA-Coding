package P2_Print_Boundary_Elements;

// Solution
// 1. Print Ist row (i=0 to C-1)
// 2. Print Last column (i=1 to R-1)
// 3. Print Last Row, starting from 2nd last element (C-2 to i=0)
// 4. Print Ist column, starting from 2nd last element (R-2 to i=1)

public class boundaryTraversal {
    public static void main(String[] args) {
        
        int mat[][] = new int[][]{{1, 2, 3, 4},
                                  {5, 6, 7, 8},
                                  {9, 10, 11, 12},
                                  {13, 14, 15, 16}};

        int R = 4;
        int C = 4;

        // For handeling corner cases, having only 1-Row or 1-Col in the given matrix.
        if(R == 1){
            for(int i=0; i<C; i++){
                System.out.print(mat[0][i] + " ");
            }
        }

        else if(C == 1){
            for(int i=0; i<C; i++){
                System.out.print(mat[i][0] + " ");
            }
        }


        // 1. Print Ist row (i=0 to C-1)
        for(int i=0; i<C; i++){
            System.out.print(mat[0][i] + " ");
        }

        // 2. Print Last column (i=1 to R-1)
        for(int i=1; i<R; i++){
            System.out.print(mat[i][C-1] + " ");
        }

        // 3. Print Last Row, starting from 2nd last element (C-2 to i=0)
        for(int i=C-2; i>=0; i--){
            System.out.print(mat[R-1][i] + " ");
        }

        // 4. Print Ist column, starting from 2nd last element (R-2 to i=1)
        for(int i=R-2; i>=1; i--){
            System.out.print(mat[i][0] + " ");
        }        
    }
}
