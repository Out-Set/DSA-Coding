function maxDiff(arr){
    let min = arr[0];
    let max = arr[0];
    for(let i=1; i<arr.length; i++){
        if(max < arr[i]){
            max = arr[i];
        }

        if(min > arr[i]){
            min = arr[i];
        }
    }
    return max-min;
}

let arr = [1,3,2,9,10,5,4,6,8,3,1];
console.log(maxDiff(arr))