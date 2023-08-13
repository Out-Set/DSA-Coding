let arr = [2,1,4,3,2,5,4,6];

let n = 1;
let lar = 0;
for(let k=1; k<=n; k++){
    lar = arr[0];
    let posOfLarEle = 0;
    for(let i=0; i<arr.length; i++){
        if(lar < arr[i]){
            lar = arr[i];
            posOfLarEle = i;
        }
    }

    for(let j=posOfLarEle; j<arr.length; j++){
        arr[j] = arr[j+1];
    }

    n--;
}

console.log(lar)
console.log(arr)