// Count 1 In A Sorted Binary Array

public class P5_Count_1_In_A_Sorted_Binary_Array {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[]{0,0,0,0,1,1,1,1,1,1,1,1,1,1,1};

        //Naive Solution
        System.out.println("Naive Solution: Occurances of 1 is " + countOne(arr));

        //Efficient Solution
        System.out.println("Efficient Solution: Occurances of 1 is " + countOneEffec(arr));
    }


    // Naive Solution
    static int countOne(int arr[]){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count++;
            }
        }
        return count;
    }


    // Efficient Solution
    static int countOneEffec(int arr[]){
        int low = 0, high = arr.length-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == 0){
                low = mid + 1;
            }

            else{
                if(mid == 0 || arr[mid-1] == 0){
                    return arr.length-mid;
                }

                else{
                    high = mid - 1;
                }
            }
        }
        return 0;
    }
}
