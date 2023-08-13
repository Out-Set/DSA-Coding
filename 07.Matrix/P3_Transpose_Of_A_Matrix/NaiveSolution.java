package P3_Transpose_Of_A_Matrix;

// Requires, Aux Space: O(RXC)
public class NaiveSolution {
    public static void main(String[] args) {
        
        int mat[][] = new int[][]{{1, 2, 3, 4},
                                  {5, 6, 7, 8},
                                  {9, 10, 11, 12},
                                  {13, 14, 15, 16}};

        int R = 4;
        int C = 4;

        int dupMat[][] = new int[4][4];

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                
                dupMat[j][i] = mat[i][j];
            }
        }

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                System.out.print(dupMat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
