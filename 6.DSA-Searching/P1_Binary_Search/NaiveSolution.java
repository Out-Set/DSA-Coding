package P1_Binary_Search;

// naive solution is basically linear-Search.

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
