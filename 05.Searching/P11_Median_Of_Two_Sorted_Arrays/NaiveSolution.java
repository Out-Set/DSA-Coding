package P11_Median_Of_Two_Sorted_Arrays;

public class NaiveSolution {
    float findMedian(int arr1[], int arr2[]){
        int len = arr1.length + arr2.length;

        //Creating a temporary array of size arr1+arr2
        int temp[] = new int[len];

        //opying element of arr1 into temp array
        for(int i=0; i<arr1.length; i++){
            temp[i] = arr1[i];            
        }

        //opying element of arr2 into temp array
        for(int j=0; j<arr2.length; j++){
            temp[arr1.length+j] = arr2[j];            
        }
        
        //Sorting the temp array
        for(int i=0; i<temp.length; i++){
            for(int j=0; j<temp.length; j++){
                if(temp[i] < temp[j]){
                    int temparr = temp[i];
                    temp[i] = temp[j];
                    temp[j] = temparr;
                }
            }    
        }

        //Now the temp arr is
        // for(int k=0; k<temp.length; k++){
        //     System.out.println(temp[k]);            
        // }

        //Finding median
        int med = temp.length/2;
        if(temp.length%2 == 0){
            return (temp[med-1] + temp[med])/2;
        }

        else{
            return  temp[med];
        }
    }
}
