import java.lang.Math;

public class LogarithmicSolution {
    int noOfDigits(int num){

        //log returns a double type value, typecast it into int
        return (int)((Math.log10(num)) + 1);
    }
}
