public class NaiveSolution {
    int getMajority(int arr[]){
        for(int i=0; i<arr.length; i++){
            int count = 1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count > arr.length/2) return i;
        }
        
        return -1;
    }
}
