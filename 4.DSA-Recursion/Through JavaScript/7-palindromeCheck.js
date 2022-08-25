// palindrome number by recursion
// start = 0, end = length-1
function isPal(str, start, end){
    if(start >= end){
        return true;
    }
    return (str.charAt(start) == str.charAt(end) && isPal(str, start+1, end-1))
}
let str = 'abakjbkaba';
let x = isPal(str, 0, str.length-1);
console.log(x)


// further optimization
function isPalOpt(str, start, end){
    if(start >= end){
        return true;
    }
    return (str[start] == str[end] && isPalOpt(str, start+1, end-1))
}
let y = isPalOpt(str, 0, str.length-1);
console.log(y)