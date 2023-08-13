function deleteEle(arr, ele){
    let posOfEle = 0;
    // element found
    for(let i=0; i<arr.length; i++){
        if(arr[i] == ele){
            posOfEle = i;
            break;
        }
    }

    //not found
    if(posOfEle == arr.length-1){
        return n;
    }

    //deletion
    for(let j=posOfEle; j<arr.length; j++){
        arr[j] = arr[j+1];
    }

    return (arr.length-1);
}

let arr = [1,2,3,4,5, ,];
console.log(deleteEle(arr, 2));
console.log(arr)