function findMidEle(arr){

    if(arr.length%2 != 0){
        return arr[Math.floor(arr.length/2)];
    }

    return false;
}
let arr = [1,2,3,4,5,9,8,3,4,5,6,3,4,5,9,9];
console.log(findMidEle(arr));