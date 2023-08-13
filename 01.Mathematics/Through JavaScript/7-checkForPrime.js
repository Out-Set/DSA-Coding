// naive solution
function naivePrime(num){
    if(num == 0 || num == 1){
        return false;
    }

    for(let i=2; i<num; i++){
        if(num%i == 0){
            return false;
        }
    }
    return true
}
console.log(naivePrime(8))


// efficient solution
function effPrime(num){
    if(num == 0 || num == 1){
        return false;
    }

    if(num == 2 || num == 3){
        return true;
    }

    if(num%2 == 0 || num%3 == 0){
        return false;
    }

    for(let i=4; i<num; i++){
        if(num%i == 0){
            return false;
        }
    }
    return true;
}
console.log(effPrime(97))


// optimized solution
function optPrime(num){
    if(num == 0 || num == 1){
        return false;
    }

    if(num == 2 || num == 3){
        return true;
    }

    if(num%2 == 0 || num%3 == 0){
        return false;
    }

    for(let i=4; i*i<=num; i=i+6){
        if(num%i == 0 || num%(i+2) == 0){
            return false;
        }
    }
    return true;
}
console.log(optPrime(11))