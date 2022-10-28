//It is based on Binary Recursive- T(n) = O(logn) and auxSpace = O(logn)

public class EfficientSolution {
    int lastOcc(int arr[], int low, int high, int num){
        int mid = (low+high)/2;
        if(low > high){
            return -1;
        }

        if(arr[mid] > num){
            return lastOcc(arr, low, mid-1, num);
        }

        else if(arr[mid] < num){
            return lastOcc(arr, mid+1, high, num);
        }

        else{
            if(mid == high || arr[mid] != arr[mid+1]){
                return mid;
            }

            else{
                return lastOcc(arr, mid+1, high, num);
            }
        }
    }
}
