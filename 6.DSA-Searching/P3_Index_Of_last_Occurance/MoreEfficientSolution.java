package P3_Index_Of_last_Occurance;

//It is based on Binary Iterative- T(n) = O(logn) and auxSpace = O(1)

public class MoreEfficientSolution {
    int lastOcc(int arr[], int num){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] > num){
                high = mid-1;
            }

            else if(arr[mid] < num){
                low = mid+1;
            }

            else{
                if(mid == high || arr[mid] != arr[mid+1]){
                    return mid;
                }
                else{
                    low = mid+1;
                }
            }
        }
        return -1;
    }
}
