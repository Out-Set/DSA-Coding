package P13_Sort_An_Array_With_Two_Type_of_Elements.Segregate_Binary_0_And_1;

// T(n) = O(n), AuxSpace = O(1)

public class EfficientSolution {
    
    static void SegregateZeroToOne(int arr[], int size){

        int i = -1, j = size;

        while(true) {
            do{
                i++;
            } while(arr[i] == 0);

            do{
                j--;
            } while(arr[j] == 1);

            if(i >= j){
                return;
            }
    
            // swap arr[i] with arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }        
    } 
}
