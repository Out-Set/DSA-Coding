// Index Of First Occurance

public class P2_Index_Of_First_Occurance {
    public static void main(String[] args) throws Exception {

        int arr[] = new int[]{10,10,10,20,20,20,30};
        int num = 20;

        //naive solution
        System.out.println("Naive Solution: First occurance of "+ num+ " is " + linSearch(arr, num));

        //Efficient solution- recursive binary search
        int low = 0;
        int high = arr.length-1;
        System.out.println("Recursive Binary Search: First occurance of "+ num+ " is " + firOccRecBin(arr, low, high, num));

        //More efficient solution- iterative binary search
        System.out.println("Iterative Binary Search: First occurance of "+ num+ " is " + firOccIterBin(arr, num));
    }

    // Linear Search
    static int linSearch(int arr[], int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }


    // Efficient Solution
    static int firOccRecBin(int arr[], int low, int high, int num){
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


    // More Efficient Solution
    static int firOccIterBin(int arr[], int num){
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
