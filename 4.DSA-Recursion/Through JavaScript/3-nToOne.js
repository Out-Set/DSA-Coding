// must analyse 3rd and 4th question with copy and pen
function nToOne(n){
    if(n == 0){
        return;
    }

    console.log(n);
    nToOne(n-1);
}

nToOne(100)