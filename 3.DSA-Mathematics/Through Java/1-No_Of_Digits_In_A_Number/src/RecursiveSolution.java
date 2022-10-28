public class RecursiveSolution {
    int noOfDigits(int num){
        if(num == 0){
            return 0;
        }

        return 1 + noOfDigits(num/10);
    }
}
