public class RecursiveBinarySearch {
    int recBinSearch(int arr[], int low, int high, int num){

        if(low > high)
            return -1;

        int mid = (low + high)/2;

        if(arr[mid] == num)
            return mid;

        else if(arr[mid] > num)
            return recBinSearch(arr, low, mid-1, num);

        else
            return recBinSearch(arr, mid+1, high, num);
    }   
}
