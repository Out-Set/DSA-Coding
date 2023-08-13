package P13_Sort_An_Array_With_Two_Type_of_Elements.Segregate_Positive_And_Negative;

// T(n) = O(n), AuxSpace = O(n)

public class NaiveSolution {
    
    static void SegregatePosToNeg(int arr[], int size){

        // Create a temp array of initial array size.
        int temp[] = new int[size];
        int i=0;

        // If -ve element found push it into temp[]
        for(int j=0; j<size; j++){
            if(arr[j] < 0){
                temp[i] = arr[j];
                i++;
            }
        }

        // If +ve element found push it into temp[]
        for(int j=0; j<size; j++){
            if(arr[j] > 0){
                temp[i] = arr[j];
                i++;
            }
        }

        // Copy element from temp[] to arr[]
        for(int j=0; j<size; j++){
            arr[j] = temp[j];
        }
    }
}
