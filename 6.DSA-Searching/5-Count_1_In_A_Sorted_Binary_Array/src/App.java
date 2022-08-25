public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[]{0,0,0,0,1,1,1,1,1,1,1,1,1,1,1};

        //Naive Solution
        NaiveSolution naive = new NaiveSolution();
        System.out.println("Naive Solution: Occurances of 1 is "+naive.countOne(arr));

        //Efficient Solution
        EfficientSolution effSol = new EfficientSolution();
        System.out.println("Efficient Solution: Occurances of 1 is "+effSol.countOneEffec(arr));
    }
}
