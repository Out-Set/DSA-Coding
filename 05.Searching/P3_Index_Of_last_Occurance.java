// Index Of last Occurance

public class P3_Index_Of_last_Occurance {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[]{10,20,30,30,30,30,40,40,40,40,50,50,50,50};
        int num = 50;

        //Naive Solution
        System.out.println("Naive Solution- Last Occurance of "+num+" is: " + lastOccNaive(arr, num));

        //Efficient Solution
        int low = 0;
        int high = arr.length-1;
        System.out.println("Naive Solution- Last Occurance of "+num+" is: " +lastOccEff(arr, low, high, num));

        //More Efficient Solution
        System.out.println("Naive Solution- Last Occurance of "+num+" is: " + lastOccOptimal(arr, num));
    }


    // Naive Solution
    // It is based on Linear Search- T(n) = O(n) and auxSpace = O(1)
    static int lastOccNaive(int[] arr, int num){
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }


    // Efficient Solution
    // It is based on Binary Recursive- T(n) = O(logn) and auxSpace = O(logn) 
    static int lastOccEff(int arr[], int low, int high, int num){
        int mid = (low+high)/2;
        if(low > high){
            return -1;
        }

        if(arr[mid] > num){
            return lastOccEff(arr, low, mid-1, num);
        }

        else if(arr[mid] < num){
            return lastOccEff(arr, mid+1, high, num);
        }

        else{
            if(mid == high || arr[mid] != arr[mid+1]){
                return mid;
            }

            else{
                return lastOccEff(arr, mid+1, high, num);
            }
        }
    }


    // More Efficient Solution
    // It is based on Binary Iterative- T(n) = O(logn) and auxSpace = O(1)
    static int lastOccOptimal(int arr[], int num){
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
