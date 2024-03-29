package P3_Transpose_Of_A_Matrix;

// In-Place and One-Traversal
// Aux Spaace = O(1)
public class EfficientSolution {
    public static void main(String[] args) {
        
        int mat[][] = new int[][]{{1, 2, 3, 4},
                                  {5, 6, 7, 8},
                                  {9, 10, 11, 12},
                                  {13, 14, 15, 16}};

        int R = 4;
        int C = 4;

        for(int i=0; i<R; i++){
            for(int j=i+1; j<C; j++){
                
                // Swap(mat[i][j], mat[j][i])
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
