public class MoreEfficientSolution {
    int firOccIterBin(int arr[], int num){
        int low = 0, high = arr.length-1;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] > num){
                high = mid - 1;
            }

            else if(arr[mid] < num){
                low = mid + 1;
            }

            else{
                if(mid == 0 || arr[mid-1] != arr[mid]){
                    return mid;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
