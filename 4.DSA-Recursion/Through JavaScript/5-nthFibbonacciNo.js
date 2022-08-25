function nthFibbonacciNo(n){
    if(n <= 1){
        return n;
    }

    return nthFibbonacciNo(n-1) + nthFibbonacciNo(n-2);
}

console.log(nthFibbonacciNo(6))