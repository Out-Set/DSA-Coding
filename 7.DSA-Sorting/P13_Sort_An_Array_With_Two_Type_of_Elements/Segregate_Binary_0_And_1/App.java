package P13_Sort_An_Array_With_Two_Type_of_Elements.Segregate_Binary_0_And_1;

public class App {
    public static void main(String[] args) {

        int arr1[] = new int[]{0, 0, 1, 0, 1, 1, 0, 0, 1};
        int n1 = arr1.length;

        // Naive Solution
        System.out.println("Naive Solution: ");
        NaiveSolution.SegregateZeroToOne(arr1, n1);
        for (int i : arr1) {
            System.out.println(i);
        }


        int arr2[] = new int[]{0, 0, 1, 0, 1, 1, 0, 0, 1};
        int n2 = arr1.length;

        // Efficient Solution
        System.out.println("Efficient Solution: ");
        EfficientSolution.SegregateZeroToOne(arr2, n2);
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
