let string = "Hi, you are in Jellyfish.";
str = string.split('');

let dupsChar = [];

for(let i=1; i<str.length; i++){
    if(str[i] == str[i-1]){
        dupsChar.push(str[i])
        

    }
}

console.log(string);
console.log(dupsChar)

for(let i=0; i<dupsChar.length; i++){

}
let dups = dupsChar.toString()

console.log(dups)


let arr = [1,2,3];
arr.slice(0, 1)
console.log(arr)
// console.log(string.replaceAll('l', ''))
