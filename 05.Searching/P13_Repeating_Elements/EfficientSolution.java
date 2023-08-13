package P13_Repeating_Elements;

public class EfficientSolution {
    int repeatingEle(int arr[]){
        //Create a boolean array of size n-1

        //We know that- Default value of boolean is false.
        boolean visited[] = new boolean[arr.length-1];

        for(int i=0; i<arr.length; i++){
            if(visited[arr[i]]) return arr[i];

            visited[arr[i]] = true;
        }

        return -1;
    }
}
