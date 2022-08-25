//T(n) = O(logn) and auxSpace = O(n)

public class EfficientSolution {
    int searchEle(int arr[], int num){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == num){
                return mid;
            }

            if(arr[low] < arr[mid]){
                if(num >= arr[low] && num <= arr[mid]){
                    high = mid - 1;
                }

                else{
                    low = mid + 1;
                }
            }

            else{
                if(num >= arr[mid] && num <= arr[high]){
                    low = mid + 1;
                }

                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
