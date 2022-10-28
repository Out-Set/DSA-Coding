public class EfficientSolution {
    int countOccEffec(int arr[], int num){
        int first = firstOcc(arr, num);
        if(first == -1){
            return 0;
        }

        else{
            return (lastOcc(arr, num) - first + 1);
        }
    }

    //First Occurance
    int firstOcc(int arr[], int num){
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

    //Last Occurance
    int lastOcc(int arr[], int num){
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
                if(mid == high || arr[mid+1] != arr[mid]){
                    return mid;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}
