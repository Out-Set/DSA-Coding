package P13_Repeating_Elements;

public class NaiveSolution {
    int repeatingEle(int nArr[]){
        for(int i=0; i<nArr.length; i++){
            if(nArr[i] == nArr[i+1]){
                return i;
            }
        }
        return -1;
    }
}
