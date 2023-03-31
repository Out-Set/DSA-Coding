package P7_Union_of_2_Sorted_Array;

import java.util.Arrays;

public class NaiveSolution {
    public static void main(String[] args) {
        
        int a[] = new int[]{1, 1, 3, 3, 4, 5, 5, 6, 90};
        int b[] = new int[]{1, 5, 6, 7, 7, 12, 13, 13, 14};

        NaiveSolution.naiveSol(a, b, 9, 9);

    }
    
    static void naiveSol(int a[], int b[], int m, int n){

        int c[] = new int[m+n];

        for (int i=0; i<m; i++) {
            c[i] = a[i];
        }
        
        for (int i=0; i<m; i++) {
            c[m+i] = b[i];
        }

        Arrays.sort(c);

        for(int i=0; i<c.length; i++){
            if(i==0 || c[i]!=c[i-1]){
                System.out.println(c[i]);
            }
        }

    }
}
