public class P3_Coin_Change {
    public static void main(String[] args) {

        // Recursive Solution
        int coins[] = {1, 2, 3};
        int sum = 4;
        int n = coins.length;
        System.out.println(getCount(coins, n, sum));

        // Dynamic Solution
        System.out.println(dGetCount(coins, n, sum));
        
    }


    // Recursive Solution
    static int getCount(int coins[], int n, int sum){
        if(sum == 0){ 
            return 1;
        }

        if(n == 0){
            return 0;
        }

        int res = getCount(coins, n-1, sum);

        if(coins[n-1] <= sum){
            res = res + getCount(coins, n, sum-coins[n-1]);
        }

        return res;
    }


    // Dynamic Solution
    static int dGetCount(int coins[], int n, int sum) {

        int dp[][] = new int[sum+1][n+1];
        for(int i=0; i<=n; i++){
            dp[0][i] = 1;
        }

        for(int i=1; i<=sum; i++){
            dp[i][0] = 0;
        }

        for(int i=1; i<=sum; i++){
            for(int j=1; j<=n; j++){
                dp[i][j] = dp[i][j-1];
                if(coins[j-1] <= i){
                    dp[i][j] += dp[i-coins[j-1]][j];
                }
            }
        }

        return dp[sum][n];

    }
}
