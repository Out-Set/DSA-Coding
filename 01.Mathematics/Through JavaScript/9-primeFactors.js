// generate all the factors of a given no, which are prime too.
// naive solution
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

function primeFact(num){
    for(let i=2; i<num; i++){
        if(isPrime(i)){
            let x = i;
            while(num%x == 0){
                console.log(i);
                x = x + i;
            }
        }
    }
}
// primeFact(12)

// efficient solution
function effPrimeFact(num){
    if(num <= 1){
        return 0;
    }

    for(let i=2; i*i<num; i++){
        while(num%i == 0){
            console.log(i);
            num = Math.floor(num/i);
        }
    }

    if(num > 1){
        print(num);
    }
}
effPrimeFact(450);