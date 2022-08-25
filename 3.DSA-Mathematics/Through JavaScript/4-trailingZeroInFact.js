// trailing zeros in factorial of a number

function fact(num){
    if(num == 0){
        return 1;
    }

    return num*fact(num-1)
}

let num = 7;
let x = fact(num);

let init = x;
let countZero = 0;
while(x%10 == 0){
    countZero++;
    x = Math.floor(x/10);
}

console.log(num, init, countZero)