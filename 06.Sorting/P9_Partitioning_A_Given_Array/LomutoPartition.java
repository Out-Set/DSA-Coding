package P9_Partitioning_A_Given_Array;

public class LomutoPartition {
    public static void main(String[] args) {
        
        int arr[] = new int[]{3,1,45,67,25,1, 6};

        int n = arr.length;

        int low = 0;
        int high = n-1;

        int res = LomutoPartition.lPartition(arr, low, high);
        System.out.println("Position of Pivot is: " + res);

    }

    static int lPartition(int arr[], int low, int high){

        // Usually last element is the pivot element
        int pivot = arr[high];

        int i = low - 1;

        for(int j=low; j<=high-1; j++){
            if(arr[j]<pivot){
                i++;

                // Swap arr[i] with arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // Swap arr[i+1] with arr[high]
        int temp1 = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp1;

        return i+1;
    }
}
