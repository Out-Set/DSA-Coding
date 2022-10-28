public class BubbleSort {
    public static void main(String[] args) throws Exception {
        
        int arr[] = new int[]{12, 10, 23, 4, 6, 2};
        int n = arr.length;

        // Naive Solution
        NaiveSolution.bubbleSort(arr, n);
        System.out.println("Naive Solution: ");
        for (int i : arr) {
            System.out.println(i);
        }

        // Optimized Solution
        OptimizedSolution.bubbleSort(arr, n);
        System.out.println("Efficient Solution: ");
        for (int i : arr) {
            System.out.println(i);
        }

        // More Optimized Solution
        MoreOptimizedSolution.bubbleSort(arr, n);
        System.out.println("More Optimized Solution: ");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

// Naive Solution
class NaiveSolution {
    static void bubbleSort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

// Optimized Solution
class OptimizedSolution {
    static void bubbleSort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            
            // j=0 to n-i-1
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

// More Optimized Solution
// If there is no swapping in first pass, means the array is sorted, hence break the loop.
class MoreOptimizedSolution {
    static void bubbleSort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            
            boolean swapped = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }

            if(swapped == false)
                break;
        }
    }
}