let num = 153;

function armNo(num){
let init = num;
let sum = 0;
while(num != 0){
    let rem = num%10;
    sum = sum + rem*rem*rem;
    num = Math.floor(num/10);
}

if(init == sum){
    return true;
}

return false;
}

// let armNum = [];
// for(let i=0; i<=100000; i++){
//     if(armNo(i) == true){
//         armNum.push(i);
//     }
// }


console.log(armNo(371));