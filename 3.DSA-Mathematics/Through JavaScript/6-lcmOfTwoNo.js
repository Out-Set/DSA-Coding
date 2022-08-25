// naive solution
function lcmOfTwo(a, b){
    let res = Math.max(a,b);
    while(true){
        if(res%a == 0 && res%b == 0){
            return res;
        }
        res++;
    }
}


// through gcd, we know that: a*b = gcd*lcm
function gcd(a,b){
    if(b == 0){
        return a;
    }
    return gcd(b, a%b);
}

function lcmThroughGcd(a,b,res){
    return Math.floor(a*b/res);
}

console.log(lcmThroughGcd(12,15,gcd(12,15)))

console.log(Math.floor(12*15/gcd(12,15)))

console.log(lcmOfTwo(4,32))