package P14_Sort_An_Array_With_three_Type_of_Elements.Three_Way_Partitioning;

public class NaiveSolution {

    public static void main(String[] args) {
        
        int arr[] = new int[]{12, 2, 10, 11, 50, 24, 12, 7, 9, 0, 1};
        int n = arr.length;

        // Pivot element: 11     "elements < pivot > elements"
        int pivot = 11;

        NaiveSolution.sort(arr, n, pivot);

        for (int i : arr) {
            System.out.println(i);
        }
    }
    
    // T(n) = theta(n), AuxSpace = theta(n)
    static void sort(int arr[], int n, int pivot){

        int temp[] = new int[n];
        int i=0;

        // Copying all elements less than pivot to temp[]
        for(int j=0; j<n; j++){
            if(arr[j] < pivot){
                temp[i] = arr[j];
                i++;
            }
        }

        // Copying all pivot to temp[]
        for(int j=0; j<n; j++){
            if(arr[j] == pivot){
                temp[i] = arr[j];
                i++;
            }
        }

        // Copying all elements greater than pivot to temp[]
        for(int j=0; j<n; j++){
            if(arr[j] > pivot){
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
