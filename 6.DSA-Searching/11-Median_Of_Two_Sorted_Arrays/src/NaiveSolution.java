public class NaiveSolution {
    void findMedian(int arr1[], int arr2[]){
        int len = arr1.length + arr2.length;
        int temp[] = new int[len];

        System.out.println(temp.length);
        System.out.println();

        for(int i=0; i<arr1.length; i++){
            temp[i] = arr1[i];            
        }

        for(int j=0; j<arr2.length; j++){
            temp[arr1.length+j] = arr2[j];            
        }
        
        for(int i=0; i<temp.length; i++){
            System.out.println(temp[i]);            
        }

        for(int i=1; i<temp.length; i++){
            if(temp[i] < temp[i-1]){
                int temparr = temp[i];
                temp[i] = temp[i-1];
                temp[i-1] = temparr;
            }
            i = i-1;
        }

        for(int i=0; i<temp.length; i++){
            System.out.println(temp[i]);            
        }
    }
}
