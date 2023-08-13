package P3_Selection_Sort;

public class SelectionSort {
    public static void main(String[] args) throws Exception {

        int arr[] = new int[]{12, 34, 2, 13, 45, 24};

        // Naive Solution
        int n = arr.length;
        System.out.println("Naive Solution: ");
        NaiveSolution.selectionSort(arr, n);
        for (int i : arr) {
            System.out.println(i);
        }

        // Optimized Solution
        System.out.println("Optimized Solution: ");
        OptimizedSolution.selectionSort(arr, n);
        for (int i : arr) {
            System.out.println(i);
        }

    }
}

// Naive Solution
// INF: Means largest num any data structure can hold
class NaiveSolution {
    static void selectionSort(int arr[], int n){

        int temp[] = new int[n];

        for(int i=0; i<n; i++){
            int min_ind = i;

            for(int j=i; j<n; j++){
                if(arr[j] < arr[min_ind]){
                    min_ind = j;
                }
            }

            temp[i] = arr[min_ind];
            // arr[min_ind] = 1000; // INF
        }

        // Copying elemens from Temp to arr
        for(int k=0; k<n; k++){
            arr[k] = temp[k];
        }
    }
}

// Optimized Solution
class OptimizedSolution {
    static void selectionSort(int arr[], int n){
        int i, j;
        for(i=0; i<n-1; i++){
            int min_ind = i;
            for(j=i+1; j<n; j++){
                if(arr[j] < arr[min_ind]){
                    min_ind = j;
                }
            }

            int temp = arr[min_ind];
            arr[min_ind] = arr[i];
            arr[i] = temp;
        }
    }
}

