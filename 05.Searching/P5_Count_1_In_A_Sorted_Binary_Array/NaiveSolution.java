package P5_Count_1_In_A_Sorted_Binary_Array;

public class NaiveSolution {
    int countOne(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
            }
        }
        return count;
    }
}
