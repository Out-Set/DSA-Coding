// naive solution
function isSorted(arr){
    for(let i=1; i<arr.length; i++){
        if(arr[i-1] > arr[i]){
            return false;
        }
    }
    return true;
}

let arr1 = [1,2,3,4,5,6];
let arr2 = [2,1,34,5,7,6];
console.log(isSorted(arr1))
console.log(isSorted(arr2))