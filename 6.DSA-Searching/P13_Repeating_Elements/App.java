package P13_Repeating_Elements;

public class App {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[]{1,0,2,3,2,2};

        //Super Naive Solution
        SuperNaiveSolution supNSol = new SuperNaiveSolution();
        System.out.println(supNSol.repeatingEle(arr));

        //Naive Solution
        int nArr[] = new int[]{1,0,2,3,2,2};
        SortArray sorArr = new SortArray();
        sorArr.sortArr(nArr);
        SuperNaiveSolution naiveSol = new SuperNaiveSolution();
        System.out.println(naiveSol.repeatingEle(nArr));

        //Efficient Solution
        EfficientSolution effSol = new EfficientSolution();
        System.out.println(effSol.repeatingEle(arr));

        //More Efficient Solution, Array having non zero element
        int arr1[] = new int[]{1,3,2,4,6,5,7,3};
        MoreEfficientSolutionWithoutElementZero solWithoutZero = new MoreEfficientSolutionWithoutElementZero();
        System.out.println(solWithoutZero.findRepeating(arr1));

        //More Efficient Solution, Array having zero element
        MoreEfficientSolutionWithElementZero  solWithZero = new MoreEfficientSolutionWithElementZero();
        System.out.println(solWithZero.findRepeating(arr));

    }
}
