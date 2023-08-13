function allMul(num){   
    while(num != 0){
        let i = 2;
        while(num%i == 0){
            console.log(i);
            num = Math.floor(num/i);
        }
        i++;
    }
}

// solution 1
function allDivSol1(num){   
    for(let i=1; i<=num; i++){
        if(num%i == 0){
            console.log(i);
        }
    }
}
allDivSol1(200)


// solution 2
function allDivSolInPair(num){
    for(let i=1; i*i<=num; i++){
        if(num%i == 0){
            // console.log(i);

            if(i != Math.floor(num/i))
            {
                console.log(i, Math.floor(num/i));
            }
        }
    }
}
allDivSolInPair(200)