public class App {
    public static void main(String[] args) throws Exception {
        int arr1[] = new int[]{10,20,30,40,50,60};
        int arr2[] = new int[]{5,15,25,35,45,55};
        
        //Naive Solution
        NaiveSolution naive = new NaiveSolution();
        float res = naive.findMedian(arr1, arr2);
        System.out.println(res);
    }
}
