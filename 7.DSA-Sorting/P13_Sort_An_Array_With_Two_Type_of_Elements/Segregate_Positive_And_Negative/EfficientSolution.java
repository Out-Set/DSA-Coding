package P13_Sort_An_Array_With_Two_Type_of_Elements.Segregate_Positive_And_Negative;

// T(n) = O(n), AuxSpace = O(1)

public class EfficientSolution {
    
    static void SegregatePosToNeg(int arr[], int size){

        int i = -1, j = size;

        while(true) {
            do{
                i++;
            } while(arr[i]<0);

            do{
                j--;
            } while(arr[j]>=0);

            if(i>=j){
                return;
            }
    
            // swap arr[i] with arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }        
    } 
}
