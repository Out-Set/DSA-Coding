// iterative solution
function iterativeSol(num){
    let count = 0
    while(num != 0){
        num = Math.floor(num/10);
        count++;
    }
    return count;
}


// recursive solution
function recursiveSol(num){
    if(num == 0){
        return 0;
    }
    return 1 + recursiveSol(Math.floor(num/10));
}


// logarithmic solution
function logarithmicSol(num){
    return Math.floor(Math.log10(num) + 1);
}


let num = 12345344;

console.log(iterativeSol(num))
console.log(recursiveSol(num))
console.log(logarithmicSol(num))


