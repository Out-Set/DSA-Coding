package P6_Square_Root_Of_Given_Number;

public class EfficientSolution {
    int sqRootFloor(int num){
        int low = 1, high = num, ans = -1;

        while(low <= high){
            int mid = (low+high)/2;
            int sqRoot = mid*mid;

            if(sqRoot == num){
                return mid;
            }

            else if(sqRoot > num){
                high = mid - 1;
            }

            else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }
}
