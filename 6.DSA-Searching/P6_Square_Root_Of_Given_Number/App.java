package P6_Square_Root_Of_Given_Number;

public class App {
    public static void main(String[] args) throws Exception {
        //If num is not a perfect square, return the floor value of it's square root.

        int num = 10;

        //Naive Solution- T(n) = theta(underRoot(x))
        NaiveSolution naive = new NaiveSolution();
        System.out.println("Naive Solution: Square root of "+num+ " is "+naive.squareRootFloor(num));

        //Efficient Solution- T(n) = O(logn)
        EfficientSolution effec = new EfficientSolution();
        System.out.println("Efficient Solution: Square root of "+num+ " is "+effec.sqRootFloor(num));
    }
}
