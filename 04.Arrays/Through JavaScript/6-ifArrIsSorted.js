function ifArrIsSorted(arr){

    for(let i=1; i<arr.length; i++){
        if(arr[i] < arr[i-1]){
            return false
        }
    }
    return true
}

let arr = [1,2,8,3,4,5];
console.log(ifArrIsSorted(arr));