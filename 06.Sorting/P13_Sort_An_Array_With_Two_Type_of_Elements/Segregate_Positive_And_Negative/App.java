package P13_Sort_An_Array_With_Two_Type_of_Elements.Segregate_Positive_And_Negative;

public class App {
    public static void main(String[] args) {

        int arr1[] = new int[]{15, 7, -8, -4, 23, -56, 0, -12, 89};
        int n1 = arr1.length;

        // Naive Solution
        System.out.println("Naive Solution: ");
        NaiveSolution.SegregatePosToNeg(arr1, n1);
        for (int i : arr1) {
            System.out.println(i);
        }


        int arr2[] = new int[]{15, 7, -8, -4, 23, -56, 0, -12, 89};
        int n2 = arr1.length;

        // Efficient Solution
        System.out.println("Efficient Solution: ");
        EfficientSolution.SegregatePosToNeg(arr2, n2);
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
