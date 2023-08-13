// recursive solution
function subSet(str, curr, i){
    if(i == str.length){
        console.log(curr);
        return;
    }

    subSet(str, curr, i+1);
    subSet(str, curr+str[i], i+1);
}

subSet("123","",0);



// binary solution
function genSubSet(str){
    let n = str.length;
    let powSize = Math.pow(2,n);
    for(let i=0; i<powSize; i++){
        for(let j=0; j<n; j++){
            if(i & (i << j) != 0){
                console.log(str[i]);
            }
        }
        console.log("\n");
    }
}

genSubSet("ABC");