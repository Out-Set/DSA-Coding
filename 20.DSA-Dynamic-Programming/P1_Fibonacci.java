class P1_Fibonacci {
    public static void main(String[] args) {
        
        int n = 5;

        // General Solution
        System.out.println(fib(n));

        // Memoization
        System.out.println(mFib(n));

        // Tabulation
        System.out.println(tFib(n));
    }

    // General Solution
    static int fib(int n) {
        if(n==0 || n==1){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }


    // Memoization
    static int mFib(int n) {

        int memo[] = new int[n+1];
        for(int i=0; i<memo.length; i++){
            memo[i] = -1;
        }

        if(memo[n] == -1){
            
            int res;
            if(n==0 || n==1){
                res = n;
            }
            else{
                res = mFib(n-1) + mFib(n-2);
            }

            memo[n] = res;
        }

        return memo[n];
    }

    
    // Tabulation
    static int tFib(int n){

        int dp[] = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}