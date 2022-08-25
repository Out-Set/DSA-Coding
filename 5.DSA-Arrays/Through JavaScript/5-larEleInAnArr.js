// efficient solution

function larEle(arr){
    let larEle = 0;
    for(let i in arr){
        if(arr[i] > larEle){
            larEle = arr[i];
        }
    }
    return larEle;
}

let arr = [2,1,4,3,99,5,6,7,4,9]
console.log(larEle(arr))
console.log(arr)


// another efficient solution
function larEleOpt(arr){
    let res = 0
    for(let i=1; i<arr.lenght; i++){
        if(arr[i] < arr[res]){
            res = i;
        }
    }
    return res;
}
console.log(larEleOpt(arr))