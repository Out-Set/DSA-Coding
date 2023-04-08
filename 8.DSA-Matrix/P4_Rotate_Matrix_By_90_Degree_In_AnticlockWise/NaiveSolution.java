package P4_Rotate_Matrix_By_90_Degree_In_AnticlockWise;

public class NaiveSolution {
    
    public static void main(String[] args) {
        
        int mat[][] = new int[][]{{1, 2, 3, 4},
                                 {5, 6, 7, 8},
                                 {9, 10, 11, 12},
                                 {13, 14, 15, 16}};

        int n = 4;

        // 1.Solution
        // Printing last column then 2nd last then 3rd last and so on.....
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[j][n-i-1] + " ");
            }
            System.out.println();
        }

        // 2. Solution
        // Last column becomes Ist-Row
        // 2nd last column becomes 2nd Row, and so on.....

        int temp[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                temp[n-j-1][i] = mat[i][j];
            }
        }

        // Copy from temp to mat
        System.out.println("2nd Solution: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = temp[i][j];
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
