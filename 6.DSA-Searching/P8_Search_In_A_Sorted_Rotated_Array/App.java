package P8_Search_In_A_Sorted_Rotated_Array;

public class App {
    public static void main(String[] args) throws Exception {
        int arr1[] = new int[]{10,20,30,40,50,60,8,9};
        int arr2[] = new int[]{100,200,300,10,20};

        int num1 = 9;
        int num2 = 300;

        //Naive Solution
        NaiveSolution naive = new NaiveSolution();
        System.out.println("Naive Solution- Element is found at index: "+naive.searchEle(arr1, num1));
        System.out.println("Naive Solution- Element is found at index: "+naive.searchEle(arr2, num2));

        //Efficient Solution
        EfficientSolution eff = new EfficientSolution();
        System.out.println("Efficient Solution- Element is found at index: "+eff.searchEle(arr1, num1));
        System.out.println("Efficient Solution- Element is found at index: "+eff.searchEle(arr2, num2));
    }
}
