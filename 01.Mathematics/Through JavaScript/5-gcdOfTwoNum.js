// naive solution
function gcdNaive(a, b){
    while(a != b){
        if(a > b){
            a = a - b;
        }
        else{
            b = b - a;
        }
    }
    return b;
}


// recursive gcd
function gcdEff(a, b){
    if(b == 0){
        return a;
    }

    return gcdEff(b, a%b);
}

console.log(gcdNaive(12,15))
console.log(gcdEff(12,15))