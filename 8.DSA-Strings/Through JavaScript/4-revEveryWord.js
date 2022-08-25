// Reverse each word in a string.
// Input:  Hi my name is <Your Name>
// Output: iH ym eman si <Your Name in Reverse>

// naive solution - 1
let str = 'Hi my name is Savan Prajapati';
console.log("Initially: ",str);

strList = str.split(' ');

let revWord = '';
for(let i=0; i<strList.length; i++){

    let word = strList[i];

    for(let j=word.length-1; j>=0; j--){
        revWord += word[j];
    }
    revWord += ' ';
}
console.log("Finally: ",revWord);


// naive solution - 2
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
