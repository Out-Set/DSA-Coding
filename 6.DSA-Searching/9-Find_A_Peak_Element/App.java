public class App {
    public static void main(String[] args) throws Exception {
        //Peak Element- Not Smaller than Neighbour
        int arr1[] = new int[]{10,20,15,5,23,90,67};
        int arr2[] = new int[]{5,10,20,15,7};

        //Naive Solution
        NaiveSolution naive = new NaiveSolution();
        System.out.println("Naive Solution- Peak Element is: "+naive.getEle(arr1));
        System.out.println("Naive Solution- Peak Element is: "+naive.getEle(arr2));

        //Efficient Solution
        EfficientSolution eff = new EfficientSolution();
        System.out.println("Efficient Solution- Peak Element is at index: "+eff.getAPeak(arr1));
        System.out.println("Efficient Solution- Peak Element is at index: "+eff.getAPeak(arr2));
    }
}
