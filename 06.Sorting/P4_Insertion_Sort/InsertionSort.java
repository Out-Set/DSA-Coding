package P4_Insertion_Sort;

public class InsertionSort {
    public static void main(String[] args) throws Exception {

        int arr[] = new int[]{3,1,45,67,25,1};
        int n = arr.length;
        NaiveSolution.insSort(arr, n);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}


class NaiveSolution {
    static void insSort(int arr[], int n){
        for(int j=1; j<n; j++){
            int key = arr[j];
            int i = j-1;
            while(i>=0 && arr[i]>key){
                arr[i+1] = arr[i];
                i = i-1;
            }
            arr[i+1] = key;
        }
    }
}