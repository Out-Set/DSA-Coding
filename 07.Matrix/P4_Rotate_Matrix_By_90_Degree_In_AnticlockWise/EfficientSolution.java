package P4_Rotate_Matrix_By_90_Degree_In_AnticlockWise;

// 1. Find transpose of Matrix.
// 2. Reverse the individual column.

// In place, T(n) = theta(n^2) and AuxSpace = theta(1)
public class EfficientSolution {
    public static void main(String[] args) {
        
        int mat[][] = new int[][]{{1, 2, 3, 4},
                                 {5, 6, 7, 8},
                                 {9, 10, 11, 12},
                                 {13, 14, 15, 16}};

        int n = 4;

        // Transpose
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                
                // Swap(mat[i][j], mat[j][i])
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        //Reverse Columns
        for(int i=0; i<n; i++){
            int low = 0, high = n-1;

            while(low<high){

                // Swap(mat[low][i], mat[high][i])
                int temp = mat[low][i];
                mat[low][i] = mat[high][i];
                mat[high][i] = temp;

                low++;
                high--;
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[i][j] + " ");
            }

            System.out.println();
        }

    }
}
