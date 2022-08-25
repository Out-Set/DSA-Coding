let arr = [4,4,4];

let x = 4;
let num = [];
let count1 = 0;
let count2 = 0;
for(let i=0; i<=arr.length; i++){
    if(arr[i] <= x){
        count1++;
        
    }
    if(arr[i] >= x){
        count2++;
    }
}
num.push(count1, count2)
console.log(count1)
console.log(count2)
console.log(num)