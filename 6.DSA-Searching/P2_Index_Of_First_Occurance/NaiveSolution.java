package P2_Index_Of_First_Occurance;

//linear search

public class NaiveSolution {
    int linSearch(int arr[], int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
