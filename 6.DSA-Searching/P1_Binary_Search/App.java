package P1_Binary_Search;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int num = sc.nextInt();

        int arr[] = new int[]{10,20,30,40,50,60,70,80,90};


        // naive solution
        NaiveSolution naive = new NaiveSolution();
        int res = naive.linSearch(arr, num);
        System.out.println("Linear Search: "+res);


        //efficient solution
        EfficientSolution efficient = new EfficientSolution();
        int res2 = efficient.binSearch(arr, num);
        System.out.println("Binary Search: "+res2);

        //recursive binary search
        RecursiveBinarySearch rbs = new RecursiveBinarySearch();
        int low = 0;
        int high = arr.length-1;
        System.out.println("Recursive Binary Search: " + rbs.recBinSearch(arr, low, high, num));

        sc.close();
    }
}

