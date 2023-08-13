// Count Occurances In a Sorted Array

public class P4_Count_Occurances_In_a_Sorted_Array {
    public static void main(String[] args) throws Exception {

        int arr[] = new int[]{10,10,10,20,30,30,30,40,40,50,50};
        int num = 30;

        //Naive Solution- T(n) = O(n)
        System.out.println("Naive Solution: Occurances of "+num+ " is " + countOcc(arr, num));

        //Efficient Solution- T(n) = O(logn)
        System.out.println("Efficient Solution: Occurances of "+num+ " is " + countOccEffec(arr, num));
    }

    // Naive Solution
    static int countOcc(int arr[], int num){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                count++;
            }
        }
        return count;
    }

    
    // Efficient Solution
    static int countOccEffec(int arr[], int num){
        int first = firstOcc(arr, num);
        if(first == -1){
            return 0;
        }

        else{
            return (lastOcc(arr, num) - first + 1);
        }
    }

    // First Occurance: Part of Efficient Solution
    static int firstOcc(int arr[], int num){
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

    // Last Occurance: Part of Efficient Solution
    static int lastOcc(int arr[], int num){
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
