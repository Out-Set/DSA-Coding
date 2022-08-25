// 1-without help of predefined methods and properties.
let str = "hello good morning everyone";
let arr = str.split(' ');
let finRes = "";

for(let i=0; i<arr.length; i++){
    if(i%2 != 0){
        let res = arr[i].split("");
        let start = 0;
        let end = res.length-1;

        while(start < end){
            let temp = res[start];
            res[start] = res[end];
            res[end] = temp;

            start++;
            end--;
        }
        // console.log(typeof res.toString())

        finRes += res.join('').toString();
        finRes += " ";
    }

    else{
        finRes += arr[i];
        finRes += " ";
    }
}
console.log(finRes)



// 2-with the help of predefined methods

// let str = "hello good morning everyone";
// let arr = str.split(' ');
// let finRes = "";

// for(let i=0; i<arr.length; i++){
//     if(i%2 != 0){
//         finRes += arr[i].split('').reverse().join('');
//         finRes += " ";
//     }

//     else{
//         finRes += arr[i];
//         finRes += " ";
//     }
// }



// inplace reversal of an string
let str2 = "helloh";
let str1 = str2.split('');
console.log(str2)

let start = 0;
let end = str2.length-1;

console.log(str1[start])
console.log(str1[end])

while(start < end){
    let temp = str1[start];
    str1[start] = str1[end];
    str1[end] = temp;

    start++;
    end--;
}

console.log(str1);
