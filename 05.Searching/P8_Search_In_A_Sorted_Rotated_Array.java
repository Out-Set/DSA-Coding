// Search In A Sorted Rotated Array

public class P8_Search_In_A_Sorted_Rotated_Array {
    public static void main(String[] args) throws Exception {
        int arr1[] = new int[]{10,20,30,40,50,60,8,9};
        int arr2[] = new int[]{100,200,300,10,20};

        int num1 = 9;
        int num2 = 300;

        //Naive Solution
        System.out.println("Naive Solution- Element is found at index: " + searchEleNaive(arr1, num1));
        System.out.println("Naive Solution- Element is found at index: " + searchEleNaive(arr2, num2));

        //Efficient Solution
        System.out.println("Efficient Solution- Element is found at index: " + searchEleEff(arr1, num1));
        System.out.println("Efficient Solution- Element is found at index: " + searchEleEff(arr2, num2));
    }


    // Naive Solution
    static int searchEleNaive(int arr[], int num){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }


    // Efficient Solution
    // T(n) = O(logn) and auxSpace = O(n)
    static int searchEleEff(int arr[], int num){
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
