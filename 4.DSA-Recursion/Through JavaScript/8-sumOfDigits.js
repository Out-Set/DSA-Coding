// naive solution
function sumOfDigits(num){
    if(num == 0){
        return 0;
    }
    return num%10 + sumOfDigits(Math.floor(num/10));
}
console.log(sumOfDigits(1234));


// optimized solution
// if(n <= 9){ return n;}
function sumOfDigitsOpt(num){
    if(num <= 9){
        return num;
    }
    return num%10 + sumOfDigits(Math.floor(num/10));
}
console.log(sumOfDigitsOpt(1239));