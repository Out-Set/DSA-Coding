// Print 1 To N Without Loop

public class P4_Print_1ToN {
    public static void main(String[] args) {
        
        int N = 100;
        printNos(N);
    }

    static void printNos(int N) {
        //Your code here

        if(N<=0){
            return;
        }

        printNos(N-1);
        System.out.print(N + " ");
    }
}
