public class NaiveSolution {
    int linSearch(int arr[], int num){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == num){
                return i;
            }
        }

        return -1;
    }
}
