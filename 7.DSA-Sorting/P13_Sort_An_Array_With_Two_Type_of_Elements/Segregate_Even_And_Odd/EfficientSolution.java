package P13_Sort_An_Array_With_Two_Type_of_Elements.Segregate_Even_And_Odd;

// T(n) = O(n), AuxSpace = O(1)

public class EfficientSolution {
    
    static void SegregateEvenToOdd(int arr[], int size){

        int i = -1, j = size;

        while(true) {
            do{
                i++;
            } while(arr[i]%2== 0);

            do{
                j--;
            } while(arr[j]%2!= 0);

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
