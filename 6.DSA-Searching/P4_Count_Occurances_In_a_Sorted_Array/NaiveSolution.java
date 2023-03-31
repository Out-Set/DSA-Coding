package P4_Count_Occurances_In_a_Sorted_Array;

public class NaiveSolution {
    int countOcc(int arr[], int num){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                count++;
            }
        }
        return count;
    }
}
