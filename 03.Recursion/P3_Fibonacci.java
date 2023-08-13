// Fibonacci Using Recursion

class P3_Fibonacci {
    public static void main(String[] args) {
        
        int n = 5;
        int res = fibonacci(n);
        System.out.println(res);
    }

    static int fibonacci(int n){
        // your code here
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fibonacci(n-1)+fibonacci(n-2);
    }
}