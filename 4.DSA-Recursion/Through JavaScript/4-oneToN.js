// must analyse 3rd and 4th question with copy and pen
function oneToN(n){
    if(n == 0){
        return;
    }

    oneToN(n-1);
    console.log(n);
}

oneToN(100)