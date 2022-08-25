function sumOfNum(n){
    if(n == 0){
        return 0;
    }

    return n+sumOfNum(n-1);
}
console.log(sumOfNum(5));