package P7_Search_In_Infinite_Size_Array;

//Search in an infinite size array which is sorted but it's size is unknown.

public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[]{1,23,34,56,66,100,200,345,567,800};
        //But the actual array be like: 
        //int arr[] = new int[]{1,23,34,56,66,100,200,345,567,800, ....................................................};
        int num1 = 22;
        int num2 = 200;

        //Naive Solution
        NaiveSolution naive = new NaiveSolution();
        System.out.println("Naive Solution: Element is found at index "+naive.search(arr, num1));
        System.out.println("Naive Solution: Element is found at index "+naive.search(arr, num2));

        //Efficient Solution
        EfficientSolution effec = new EfficientSolution();
        System.out.println("Efficient Solution: Element is found at index "+effec.effSearch(arr, num1));
        System.out.println("Efficient Solution: Element is found at index "+effec.effSearch(arr, num2));
    }
}
