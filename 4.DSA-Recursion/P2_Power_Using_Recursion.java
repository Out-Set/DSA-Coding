// Power Using Recursion

public class P2_Power_Using_Recursion {
    public static void main(String[] args) {
        
        int n = 2;
        int p = 3;

        int res = RecursivePower(n, p);
        System.out.println(res);
    }

    static int RecursivePower(int n,int p)  {
        // add your code here

        if(p==0){
            return 1;
        }

        return n*RecursivePower(n, p-1);
    } 
}
