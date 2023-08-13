public class P6_Count_Total_Digits {
    public static void main(String[] args) {
        
        int n = 123456;
        int res = countDigits(n);
        System.out.println(res);
    }

    static int countDigits(int n) {
        // add your code here
        if(n/10 == 0){
            return 1;
        }

        return 1+countDigits(n/10);
    }
}
