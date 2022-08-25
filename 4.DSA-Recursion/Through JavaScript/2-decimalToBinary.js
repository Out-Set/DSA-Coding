function decToBin(n){
    if(n == 0){
        return;
    }

    decToBin(Math.floor(n/2));
    console.log(n%2);
}

decToBin(4)