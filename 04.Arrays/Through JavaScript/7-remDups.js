// create a distnict array, copy only unique element to this array, then move to original.
// findig duplicates in a sorted array
function remDup(arr){
    let dups = [];

    for(let i=1; i<arr.length; i++){
        let dup = arr[i];
        if(arr[i-1] == dup){
            dups.push(arr[i-1]);
        }
    }
    return dups;
}
let arr = [4,4,1,1,1,2,3,4,4,4,5,5,5,9,9]
console.log(remDup(arr))


// remove dups in unsorted array
function remDupsInUnSor(arr2){
    let res = 1;
    for(let i=1; i<arr2.length; i++){

        if(arr2[res - 1] != arr2[i]){
            arr2[res] = arr2[i];
            res++;
        }


        // for(let j=0; j<arr.length; j++){
        //     if(arr[j] == arr[i]){
        //         dups.push(arr[i]);
        //     }
        // }
    }
    return res;
}

let arr2 = [3,3,3,4,43,21,34,5,2,4,4,5,5,5];
// console.log(remDupsInUnSor(arr2));