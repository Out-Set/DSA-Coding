public class NaiveSolution {
    int squareRootFloor(int num){
        int i = 1;
        while(i*i <= num){
            i++;
        }
        return (i-1);
    }
}
