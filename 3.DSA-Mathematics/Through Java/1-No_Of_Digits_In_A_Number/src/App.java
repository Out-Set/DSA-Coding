import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        sc.close();

        //Iteraive Solution
        IterativeSolution iterSol = new IterativeSolution();
        System.out.println("Iterative Solution: "+ iterSol.noOfDigits(num));

        //Recursive Solution
        RecursiveSolution recSol = new RecursiveSolution();
        System.out.println("Recursive Solution: "+ recSol.noOfDigits(num));

        //Logarithmic Solution
        LogarithmicSolution logSol = new LogarithmicSolution();
        System.out.println("Logarithmic Solution: "+ logSol.noOfDigits(num));
    }
}
