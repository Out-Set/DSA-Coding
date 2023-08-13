package P14_Sort_An_Array_With_three_Type_of_Elements.Sort_With_0_1_And_2;

public class NaiveSolution {

    public static void main(String[] args) {
        
        int arr[] = new int[]{0, 2, 0, 1, 0, 1, 2, 1, 0, 0, 1};
        int n = arr.length;
        NaiveSolution.sort(arr, n);

        for (int i : arr) {
            System.out.println(i);
        }
    }
    
    // T(n) = theta(n), AuxSpace = theta(n)
    static void sort(int arr[], int n){

        int temp[] = new int[n];
        int i=0;

        // Copying all 0 to temp[]
        for(int j=0; j<n; j++){
            if(arr[j] == 0){
                temp[i] = arr[j];
                i++;
            }
        }

        // Copying all 1 to temp[]
        for(int j=0; j<n; j++){
            if(arr[j] == 1){
                temp[i] = arr[j];
                i++;
            }
        }

        // Copying all 2 to temp[]
        for(int j=0; j<n; j++){
            if(arr[j] == 2){
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
