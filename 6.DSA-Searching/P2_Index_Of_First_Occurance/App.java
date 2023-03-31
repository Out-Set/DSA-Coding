package P2_Index_Of_First_Occurance;

public class App {
    public static void main(String[] args) throws Exception {

        int arr[] = new int[]{10,10,10,20,20,20,30};
        int num = 20;

        //naive solution
        NaiveSolution naive = new NaiveSolution();
        System.out.println("Naive Solution: First occurance of "+ num+ " is "+naive.linSearch(arr, num));

        //Efficient solution- recursive binary search
        int low = 0;
        int high = arr.length-1;
        EfficientSolution rbs = new EfficientSolution();
        System.out.println("Recursive Binary Search: First occurance of "+ num+ " is "+rbs.firOccRecBin(arr, low, high, num));

        //More efficient solution- iterative binary search
        MoreEfficientSolution iterSol = new MoreEfficientSolution();
        System.out.println("Iterative Binary Search: First occurance of "+ num+ " is "+iterSol.firOccIterBin(arr, num));
    }
}
