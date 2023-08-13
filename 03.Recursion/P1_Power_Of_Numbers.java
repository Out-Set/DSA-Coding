// Power Of Numbers
// Given a number and its reverse. Find that number raised to the power of its own reverse.
// Note: As answers can be very large, print the result modulo 109 + 7.

class P1_Power_Of_Numbers{
    public static void main(String[] args) {
        
        int N = 12;
        int R = 21; //Reverse of N
        long res1 = power1(N, R);
        System.out.println(res1);

        long res2 = power1(N, R);
        System.out.println(res2);
    }

    // Naive Solution
    static long power1(int N,int R) {
        //Your code here

        long res = 1;
        long m = 1000000007;

        for(int i=1; i<=R; i++){
            res = res*N;
            res = res%m;
        }

        return res;             
    }

    // Efficient Solution
    static long power2(int N, int R) {
        long ans = 1;
        long mod = 1000000007, pow = N * 1L;
        while (R > 0) {
 
            // When rev is odd
            if (R % 2 == 1) {
                ans = (ans * pow) % mod;
            }
            pow = (pow * pow) % mod;
 
            // Shifting right (rev = rev/2 )
            R >>= 1;
        }
        return ans;
    }

}