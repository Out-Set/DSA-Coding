// recursive
function recFact(num){
    if(num == 0){
        return 1;
    }
    return num*fun(num-1);
}


// iterative 
function iterFact(num){
    if(num == 0){
        return 1;
    }
    let sum = 1;
    while(num > 0){
        sum = sum * num;
        num--;
    }
    return sum
}

console.log(recFact(0))
console.log(iterFact(5))
