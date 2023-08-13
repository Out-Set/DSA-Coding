package P7_Search_In_Infinite_Size_Array;

public class EfficientSolution {
    int effSearch(int arr[], int num){
        if(arr[0] == num){
            return 0;
        }

        int i = 1;
        while(arr[i] < num)
            i = i*2;
        if(arr[i] == num) return i;

        BinarySearch binSer = new BinarySearch();
        return binSer.binarySearch(arr, num, i/2, i-1);
    }
}
