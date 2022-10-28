//It is based on Linear Search- T(n) = O(n) and auxSpace = O(1)

public class NaiveSolution {
    int lastOcc(int[] arr, int num){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
