package P12_Majority_Element;

public class EfficientSolution {
    int getMajority(int arr[]){
        int count = 1, res = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[res] == arr[i])
                count++;
            else
                count --;            
            if(count == 0){
                count = 1; res = i;
            }
        }

        count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == arr[res])
                count++;
        }

        if(count <= arr.length/2) res = -1;

        return res;
    }
}
