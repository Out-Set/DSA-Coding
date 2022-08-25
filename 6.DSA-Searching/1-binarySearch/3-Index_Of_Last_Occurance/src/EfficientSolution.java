public class EfficientSolution {
    int lastOccByRecBin(int arr[], int low, int high, int num){
        if(low > high){
            return -1;
        }

        int mid = (low+high)/2;
        if(arr[mid] > num){
            return lastOccByRecBin(arr, low, mid-1, num);
        }

        else if(arr[mid] < num){
            return lastOccByRecBin(arr, mid+1, high, num);
        }

        else{
            if(mid == high || arr[mid] != arr[mid+1]){
                return mid;
            }
            else{
                return lastOccByRecBin(arr, mid+1, high, num);
            }
        }
    }
}
