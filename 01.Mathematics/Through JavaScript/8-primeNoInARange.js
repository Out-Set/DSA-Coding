// generate prime numbers in a given range, i.e. 1 to 100.

function isPrime(num){
    if(num <= 1){
        return false;
    }

    if(num == 2 || num == 3){
        return true;
    }

    if(num%2 == 0 || num%3 ==0){
        return false;
    }

    for(let i=4; i*i<=num; i++){
        if(num%i == 0 || num%(i+2) == 0){
            return false;
        }
    }
    return true;
}

let primeNo = [];
for(let i=0; i<=100; i++){
    if(isPrime(i) == true){
        primeNo.push(i);
    }
}

console.log(primeNo)
