// Sum of Digits of a Number

public class P5_Sum_of_Digits {
    public static void main(String[] args) {
        
        int n = 123456;
        int res = sumOfDigits(n);
        System.out.println(res);
    }

    static int sumOfDigits(int n) {
        // add your code here
        if(n/10 == 0){
            return n;
        }

        return (n%10)+sumOfDigits(n/10);
    }
}
