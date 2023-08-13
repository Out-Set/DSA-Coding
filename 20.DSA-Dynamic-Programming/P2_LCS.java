public class P2_LCS {
    public static void main(String[] args) {
        
        String s1 = "bbbab";
        String s2 = "abbbb";
        int m = s1.length();
        int n = s2.length();

        // General Solution
        System.out.println(LCS(s1, s2, m, n));

        // Memoization
        System.out.println(mLCS(s1, s2, m, n));

        // Tabulation
        System.out.println(tLCS(s1, s2, m, n));

    }


    // General Solution
    static int LCS(String s1, String s2, int m, int n){

        if(m==0 || n==0){
            return 0;
        }

        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return 1 + LCS(s1, s2, m-1, n-1);
        }

        else{
            return Math.max(LCS(s1, s2, m-1, n), LCS(s1, s2, m, n-1));
        }
    }


    // Memoization
    static int mLCS(String s1, String s2, int m, int n) {

        // memo array filled with value '0'
        int memo[][] = new int[m+1][n+1]; 
        for(int i=0; i<memo.length; i++){
            for(int j=0; j<memo.length; j++){
                memo[i][j] = -1;
            }
        }

        if(memo[m][n] != -1){
            return memo[m][n];
        }

        if(m==0 || n==0){
            memo[m][n] = 0;
        }

        else{
            if(s1.charAt(m-1) == s2.charAt(n-1)){
                memo[m][n] =  1 + LCS(s1, s2, m-1, n-1);
            }
            else{
                memo[m][n] =  Math.max(LCS(s1, s2, m-1, n), LCS(s1, s2, m, n-1));
            }
        }

        return memo[m][n];
    }


    // Tabulation
    static int tLCS(String s1, String s2, int m, int n) {

        // dp array filled Ist-row and Ist-column with value '0'
        int dp[][] = new int[m+1][n+1]; 
        for(int i=0; i<m+1; i++){
            dp[i][0] = 0;
        }
        for(int j=1; j<n+1; j++){
            dp[0][j] = 0;
        }

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }

                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[m][n];
    }
}
