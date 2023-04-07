let str = "diioi omcom iooi";
str = str.split(' ')

console.log(str[0])

console.log(str)
let res = '';
for(let i=0; i<str.length; i++){
    let init = str[i];
    for(let j=init.length-1; j>=0; j--){
        res += init[j]
    }
    res += ' ';
}
console.log(res)


let str2 = 'ty654x uuh7 ujij';
let str3 = '';
for(let i=str2.length-1; i>=0; i--){
    str3 += str2[i];
}
console.log(str3.replaceAll(' ', ','));


let arr = [1,2,3,4];
arr[0] = 5;
arr[1] = 6;
arr[2] = 7;
arr[3] = 8;


