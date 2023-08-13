package P6_Intersection_of_2_Sorted_Array;

// This solution can work on unsorted array too.
// T(n): O(mXn)
// 'm' and 'n' are size of array 'a' and 'b'.

public class NaiveSolution {
    public static void main(String[] args) {
        
        int a[] = new int[]{1, 1, 3, 3, 4, 5, 5, 6, 90};
        int b[] = new int[]{1, 5, 6, 7, 7, 12, 13, 13, 14};

        int m = a.length;
        int n = b.length;

        NaiveSolution.intersection(a, b, m, n);
    }

    static void intersection(int a[], int b[], int m, int n){
        for(int i=0; i<m; i++){
            if(i>0 && a[i] == a[i-1]){
                continue;
            }
            for(int j=0; j<n; j++){
                if(a[i] == b[j]){
                    System.out.println(a[i] + " ");
                    break;
                }
            }
        }
    }
}
