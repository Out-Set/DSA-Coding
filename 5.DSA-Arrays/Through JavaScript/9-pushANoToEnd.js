// naive solution - O(n^2)
// first find a zero, then look for it's left element. if it is non-zero swap it with zero.
function pushANoToEndNaive(arr){
    for(let i=0; i<arr.length; i++){
        if(arr[i] == 0){
            for(let j=i+1; j<arr.length; j++){
                if(arr[j] != 0){
                    let temp = arr[i]
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }  
    return arr;
}
let arr1 = [1,0,4,0,2,2,0,1,2];
console.log(pushANoToEndNaive(arr1))



// keep track of non zero element
// begin from zero, whenever we see a non-zero element increment the count, swap the
//  non-zero element with the previous index count

function pushANoToEnd(arr, num)
{
    let count = 0;
    for (let i=0; i<arr.length; i++){

        if (arr[i] != num){

            let temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;

            count++;
        }
    }
}

let arr = [1,0,0,2,2,1,2];
pushANoToEnd(arr, 0)
console.log(arr)


function pushACharToEnd(str, char){
    let count = 0;
    for(let i=0; i<str.length; i++){
        if(str[i] != char){
            let temp = str[i]
            str[i] = str[count];
            str[count] = temp;

            count++;
        }
    }
    return str;
}

let str = "goodmorning";
str = str.split('')
let res = pushACharToEnd(str, "o");
res = res.toString().replaceAll(',','');
console.log(res)

