package P8_Search_In_A_Sorted_Rotated_Array;

//

public class NaiveSolution {
    int searchEle(int arr[], int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
