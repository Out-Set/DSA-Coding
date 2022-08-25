// recursion with fault, Maximum call stack size exceeded

function rec1(){
    console.log('Recursion');
    rec1();
}
// rec()


// correction, have to add a base case
function rec2(n){
    if(n == 0){
        return;
    }

    console.log('With Modification.');

    rec2(n-1);
}
rec2(5)


// example-1
function exam1(n){
    if(n == 0){
        return 0;
    }
    console.log(n);
    exam1(n-1);
    console.log(n);
}
exam1(4)


// example-2
function exam2(n){
    if(n == 0){
        return;
    }

    exam2(n-1);
    console.log(n);
    exam2(n-1);
}
exam2(7);


// example-3
function exam3(n){
    if(n == 1){
        return 1;
    }

    return 1 + exam3(Math.floor(n/2))
}
console.log(exam3(16))

