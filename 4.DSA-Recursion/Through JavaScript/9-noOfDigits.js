function noOfDigits(num){
    if(num == 0){
        return 0;
    }

    return 1 + noOfDigits(Math.floor(num/10));
}
console.log(noOfDigits(123567))
console.log(noOfDigits(48439039))


// optimized solution
// if(n <= 9){ return n;}
function noOfDigitsOpt(num){
    if(num <= 9){
        return num;
    }
    return 1 + noOfDigits(Math.floor(num/10));
}
console.log(noOfDigitsOpt(12379));