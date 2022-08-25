public class BinarySearch {
    int binarySearch(int arr[], int num, int low, int high){
        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == num) return mid;

            else if(arr[mid] > num) return high = mid-1;

            else low = mid+1;
        }
        return -1;
    }
}
