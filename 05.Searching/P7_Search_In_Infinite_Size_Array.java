// Search In an Infinite Size Array


public class P7_Search_In_Infinite_Size_Array {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[]{1,23,34,56,66,100,200,345,567,800};
        //But the actual array be like: 
        //int arr[] = new int[]{1,23,34,56,66,100,200,345,567,800, ....................................................};
        int num1 = 22;
        int num2 = 200;

        //Naive Solution
        System.out.println("Naive Solution: Element is found at index " + search(arr, num1));
        System.out.println("Naive Solution: Element is found at index " + search(arr, num2));

        //Efficient Solution
        System.out.println("Efficient Solution: Element is found at index " + effSearch(arr, num1));
        System.out.println("Efficient Solution: Element is found at index " + effSearch(arr, num2));
    }


    // Naive Solution
    static int search(int arr[], int num){
        int i = 0;
        while(true){
            if(arr[i] == num) return i;
            if(arr[i] > num) return -1;
            i++;
        }
    }
    

    // Efficient Solution
    static int effSearch(int arr[], int num){
        if(arr[0] == num){
            return 0;
        }

        int i = 1;
        while(arr[i] < num)
            i = i*2;
        if(arr[i] == num) return i;

        return binarySearch(arr, num, i/2, i-1);
    }


    // Binary Search: Part of Efficient Solution
    static int binarySearch(int arr[], int num, int low, int high){
        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == num) return mid;

            else if(arr[mid] > num) return high = mid-1;

            else low = mid+1;
        }
        return -1;
    }
}
