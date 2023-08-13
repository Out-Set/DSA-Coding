package P15_Minimum_Difference_In_An_Array;

public class NaiveSolution {
    public static void main(String[] args) {
        
        int arr[] = new int[]{1, 8, 12, 5, 18};
        int n = arr.length;

        System.out.println("Minimum Difference: " + NaiveSolution.getMinDiff(arr, n));
    }


    static int getMinDiff(int arr[], int n){

        int res = Integer.MAX_VALUE;

        for(int i=1; i<n; i++){
            for(int j=0; j<n; j++){
                res = Math.min(res, Math.abs(arr[i]-arr[j]));
            }
        }

        return res;
    }
}
