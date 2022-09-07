public class App {
    public static void main(String[] args) throws Exception {

        //Return index of the majority element else -1.
        int arr[] = new int[]{1,8,8,1,2,3,8,8,8,9,8};

        //Naive Solution
        NaiveSolution getMaj = new NaiveSolution();
        System.out.println(getMaj.getMajority(arr));


        //Efficient Solution
        EfficientSolution effSol = new EfficientSolution();
        System.out.println(effSol.getMajority(arr));
    }
}
