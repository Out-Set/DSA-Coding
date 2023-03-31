package P7_Union_of_2_Sorted_Array;

public class EfficientSolution {
    public static void main(String[] args) {
        
        int a[] = new int[]{1, 1, 3, 3, 4, 5, 5, 6, 90};
        int b[] = new int[]{1, 5, 6, 7, 7, 12, 13, 13, 14};

        EfficientSolution.effSol(a, b, 9, 9);

    }

    static void effSol(int a[], int b[], int m, int n) {

        int i=0, j=0;

        while(i<m && j<n){

            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }

            if(j>0 && b[j]==b[j-1]){
                j++;
                continue;
            }

            if(a[i] < b[j]){
                System.out.println(a[i]);
                i++;
            }

            if(a[i] > b[j]){
                System.out.println(b[j]);
                j++;
            }

            if(a[i] == b[j]){
                System.out.println(a[i]);  // or System.out.println(b[j]);
                i++;
                j++;
            }
        }

        // Other remainings elements of a[] and b[]

        while(i<m){
            if(i>0 && a[i]!=a[i-1]){
                System.out.println(a[i]);
                i++;
            }
        }

        while(j<n){
            if(j>0 && b[j]!=b[j-1]){
                System.out.println(b[j]);
                j++;
            }
        }

        // for(int k=j; k<n; k++){
        //     if(k>0 && b[k]!=b[k-1]){
        //         System.out.println(b[k]);
        //     }
        // }
    }
}
