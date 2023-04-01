package P14_Sort_An_Array_With_three_Type_of_Elements.Partition_Around_A_Range;

public class NaiveSolution {

    public static void main(String[] args) {
        
        int arr[] = new int[]{12, 2, 10, 11, 50, 24, 12, 7, 9, 0, 1};
        int n = arr.length;

        // range: [10, 24]
        int start = 10;
        int end = 24;

        NaiveSolution.sort(arr, n, start, end);

        for (int i : arr) {
            System.out.println(i);
        }
    }
    
    // T(n) = theta(n), AuxSpace = theta(n)
    static void sort(int arr[], int n, int start, int end){

        int temp[] = new int[n];
        int i=0;

        // Copying all element before start to temp[]
        for(int j=0; j<n; j++){
            if(arr[j] < start){
                temp[i] = arr[j];
                i++;
            }
        }

        // Copying all element in range to temp[]
        for(int j=0; j<n; j++){
            if(arr[j] >= start && arr[j] <= end){
                temp[i] = arr[j];
                i++;
            }
        }

        // Copying all element after end to temp[]
        for(int j=0; j<n; j++){
            if(arr[j] > end){
                temp[i] = arr[j];
                i++;
            }
        }

        // Copying temp[] to arr[] 
        for(int j=0; j<n; j++){
            arr[j] = temp[j];
        }
    }
}
