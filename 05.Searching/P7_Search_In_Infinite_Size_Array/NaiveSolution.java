package P7_Search_In_Infinite_Size_Array;

public class NaiveSolution {
    int search(int arr[], int num){
        int i = 0;
        while(true){
            if(arr[i] == num) return i;
            if(arr[i] > num) return -1;
            i++;
        }
    }
}
