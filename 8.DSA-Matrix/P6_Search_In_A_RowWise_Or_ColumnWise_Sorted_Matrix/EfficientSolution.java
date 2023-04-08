package P6_Search_In_A_RowWise_Or_ColumnWise_Sorted_Matrix;

// T(n) = O(R+C)
public class EfficientSolution {
    public static void main(String[] args) {
        
        int mat[][] = new int[][]{{1, 2, 3, 4},
                                  {5, 6, 7, 8},
                                  {9, 10, 11, 12},
                                  {13, 14, 15, 16}};

        
        NaiveSolution.search(mat, 11);
        NaiveSolution.search(mat, 15);

        NaiveSolution.search(mat, 18);
    }

    static void search(int mat[][], int x){

        int R = 4;
        int C = 4;

        int i=0, j=C-1;

        while(i<R && j>=C){
            if(mat[i][j] == x){
                System.out.println("Found At (" + i + " " + j + ")");
                return;
            }

            else if(mat[i][j] > x){
                j--;
            }

            else{
                i++;
            }
        }

        System.out.println("Not Found");
    }
}
