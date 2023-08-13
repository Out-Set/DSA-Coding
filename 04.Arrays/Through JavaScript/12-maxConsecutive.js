function maxCons(arr){
    let max = 0
    for(let i=0; i<arr.length; i++){
        for(let j=0; j<arr.length; j++){
            while(arr[i] != arr[j]){
                max++;
            }
        }
    }
    return max;
}

let arr = [1,1,1,1,3,4,5,6,6,61,1,11,1,1,1,1];
console.log(maxCons(arr))

