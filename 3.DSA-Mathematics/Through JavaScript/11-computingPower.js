// naive solution
function computePower(num, pow){
    let res = 1;
    for(let i=1; i<=pow; i++){
        res = res * num;
    }
    return res;
}

console.log(computePower(3,3))

console.log(Math.pow(3,3))
