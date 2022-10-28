public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[]{10,20,30,30,30,30,40,40,40,40,50,50,50,50};
        int num = 50;

        //Naive Solution
        NaiveSolution naive = new NaiveSolution();
        System.out.println("Naive Solution- Last Occurance of "+num+" is: "+naive.lastOcc(arr, num));

        //Efficient Solution
        int low = 0;
        int high = arr.length-1;
        EfficientSolution Eff = new EfficientSolution();
        System.out.println("Naive Solution- Last Occurance of "+num+" is: "+Eff.lastOcc(arr, low, high, num));

        //More Efficient Solution
        MoreEfficientSolution moreEff = new MoreEfficientSolution();
        System.out.println("Naive Solution- Last Occurance of "+num+" is: "+moreEff.lastOcc(arr, num));
    }
}
