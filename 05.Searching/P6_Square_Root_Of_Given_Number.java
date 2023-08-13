// Square Root Of Given Number


public class P6_Square_Root_Of_Given_Number {
    public static void main(String[] args) throws Exception {
        //If num is not a perfect square, return the floor value of it's square root.

        int num = 10;

        //Naive Solution- T(n) = theta(underRoot(x))
        System.out.println("Naive Solution: Square root of "+num+ " is " + squareRootFloor(num));

        //Efficient Solution- T(n) = O(logn)
        System.out.println("Efficient Solution: Square root of "+num+ " is " + sqRootFloor(num));
    }


    // Naive Solution
    static int squareRootFloor(int num){
        int i = 1;
        while(i*i <= num){
            i++;
        }
        return (i-1);
    }


    // Efficient Solution
    static int sqRootFloor(int num){
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
