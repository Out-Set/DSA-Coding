// naive solution
function ledrsInAnArr(arr){
    for(let i=0; i<arr.length; i++){
        let flag = false;
        for(let j=i+1; j<arr.length; j++){
            if(arr[i] <= arr[j]){
                flag = true;
                break;
            }
        }
        if(flag == false){
            console.log(arr[i]);
        }
    }  
}
let arr = [1,3,2,9,5,4,6,8,3,1];
// ledrsInAnArr(arr)


// efficient solution
// will print the leader from right to left
// traverse from the right most, beacuse right-most element is always a leader.
// if the current element is greater than the right side, make the current element 
//   as leader and print it.

function leadersInAnArrOpt(arr){
    let currLdr = arr[arr.length-1];
    console.log(currLdr);
    for(let i=arr.length-2; i>=0; i--){
        if(currLdr < arr[i]){
            currLdr = arr[i];
            console.log(currLdr)
        }
    }
}

leadersInAnArrOpt(arr)
