public class App {
    public static void main(String[] args) throws Exception {
        
        int arr[] = new int[]{10,20,20,20,30,30,30,40,40};
        int num = 30;

        ///naive solution- linear search
        NaiveSolution ls = new NaiveSolution();
        System.out.println("Naive solution: Last occurance of "+num+" is at index "+ls.linSearch(arr, num));


        //Efficient solution- recursive binary search
        int low = 0, high = arr.length-1;
        EfficientSolution rbs = new EfficientSolution();
        System.out.println("Efficient solution: Last occurance of "+num+" is at index "+rbs.lastOccByRecBin(arr, low, high, num));

        //More efficient solution- iterative binary search
        MoreEfficientSolution ibs = new MoreEfficientSolution();
        System.out.println("More Efficient solution: Last occurance of "+num+" is at index "+ibs.lastOccByIterBin(arr, num));
    }
}
