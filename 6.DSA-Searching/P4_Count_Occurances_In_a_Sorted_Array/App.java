package P4_Count_Occurances_In_a_Sorted_Array;

public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[]{10,10,10,20,30,30,30,40,40,50,50};
        int num = 30;

        //Naive Solution- T(n) = O(n)
        NaiveSolution occ = new NaiveSolution();
        System.out.println("Naive Solution: Occurances of "+num+ " is "+occ.countOcc(arr, num));

        //Efficient Solution- T(n) = O(logn)
        EfficientSolution occur = new EfficientSolution();
        System.out.println("Efficient Solution: Occurances of "+num+ " is "+occur.countOccEffec(arr, num));
    }
}
