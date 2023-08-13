package P13_Repeating_Elements;

public class MoreEfficientSolutionWithoutElementZero {
    int findRepeating(int arr[]){
        int slow = arr[0], fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);

        slow = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}
