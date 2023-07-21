public class P4_Edit_Distance {
    public static void main(String[] args) {
        
        String s1 = "CAT";
        String s2 = "CUT";
        int m = s1.length();
        int n = s2.length();

        // Recursive Solution
        System.out.println(eD(s1, s2, m, n));

        // Dynamic Solution
        System.out.println(dED(s1, s2, m, n));
    }


    // Recursive Solution
    static int eD(String s1, String s2, int m, int n){
        if(m==0){
            return n;
        }
        if(n==0){
            return m;
        }

        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return eD(s1, s2, m-1, n-1);
        }
        else{
            return 1 + Math.min(eD(s1, s2, m-1, n), Math.min(eD(s1, s2, m, n-1), eD(s1, s2, m-1, n-1)));
        }
    }


    // Dynamic Solution
    static int dED(String s1, String s2, int m, int n){

        int dp[][] = new int[m+1][n+1];

        for(int i=0; i<m; i++){
            dp[0][i] = i;
        }

        for(int i=0; i<n; i++){
            dp[i][0] = i;
        }

        for(int i=1; i<=m; i++){
            for(int j=1; i<=n; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1]));
                }
            }
        }

        return dp[m][n];
    }
}
