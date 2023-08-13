package P2_Index_Of_First_Occurance;

public class EfficientSolution {
    int firOccRecBin(int arr[], int low, int high, int num){
        if(low > high){
            return -1;
        }

        int mid  = (low=high)/2;
        if(num > arr[mid]){
            return firOccRecBin(arr, mid+1, high, num);
        }

        else if(num < arr[mid]){
            return firOccRecBin(arr, low, mid-1, num);
        }

        else{
            if(mid == 0 || arr[mid-1] != arr[mid]){
                return mid;
            }

            else{
                return firOccRecBin(arr, low, mid-1, num);
            }
        }
    }
}
