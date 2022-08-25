function subSet(str, curr, i){
    if(i == str.length){
        print(curr);
        return;
    }

    subSet(str, curr, i+1);
    subSet(str, curr+str[i], i+1);
}

subSet("ABC"," ",0)



function fun(){
    let a = 5;
    let b = 6;
    let c = 3;
}

let x = Math.pow(98,89);
console.log(x%1000000007);

let num = 123;
let init = num;
let rev = 0;
while(num != 0){
    let rem = num%10;
    rev = rev*10 + rem;
    num = Math.floor(num/10);
}

console.log(rev)
