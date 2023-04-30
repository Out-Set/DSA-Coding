package P6_Intersection_of_2_Sorted_Array;

public class EfficientSolution {
    public static void main(String[] args) {
        
        int a[] = new int[]{1, 1, 3, 3, 4, 5, 5, 6, 90};
        int b[] = new int[]{1, 5, 6, 7, 7, 12, 13, 13, 14};

        int m = a.length;
        int n = b.length;

        EfficientSolution.intersection(a, b, m, n);
    }

    static void intersection(int a[], int b[], int m, int n) {
        int i=0, j=0;

        while(i<m && j<n){
            if(i>0 && a[i] == a[i-1]){
                i++;
                continue;
            }

            if(a[i] < b[j]){
                i++;
            }
            
            if(a[i] == b[j]){
                System.out.println(a[i] + " ");
                i++;
                j++;
            }
        }
    }
}
