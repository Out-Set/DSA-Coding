// Binary Search

import java.util.*;

public class P1_Binary_Search {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int num = sc.nextInt();

        int arr[] = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

        // naive solution
        int res = linSearch(arr, num);
        System.out.println("Linear Search: " + res);

        // efficient solution
        int res2 = binSearch(arr, num);
        System.out.println("Binary Search: " + res2);

        // recursive binary search
        int low = 0;
        int high = arr.length - 1;
        System.out.println("Recursive Binary Search: " + recBinSearch(arr, low, high, num));

        sc.close();
    }

    // naive solution is basically linear-Search.
    static int linSearch(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    // binary search
    static int binSearch(int arr[], int num) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == num) {
                return mid;
            }

            else if (arr[mid] > num) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    // recursive binary search
    static int recBinSearch(int arr[], int low, int high, int num) {

        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == num)
            return mid;

        else if (arr[mid] > num)
            return recBinSearch(arr, low, mid - 1, num);

        else
            return recBinSearch(arr, mid + 1, high, num);
    }

}
