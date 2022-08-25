// with iteration, 2 for-loop
function sortArray(arr){

    for(let i=0; i<arr.length; i++){
        for(let j=0; j<arr.length; j++){
            if(arr[i] < arr[j]){
                let temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return arr;
}
let arr = [12,1,5,52,2,4,3,2,56,78,3,4,9];
// console.log(sortArray(arr))

// with iteration, 1 for-loop
function Sort(arr){
    for(let i=0; i<arr.length; i++){
        if(arr[i] > arr[i+1]){
            let temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            i = -1;
        }
    }
    return arr;
}

console.log(Sort(arr))

