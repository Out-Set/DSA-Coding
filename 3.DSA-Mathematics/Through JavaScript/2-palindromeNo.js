function palindrome(num){
    let rem = 0;
    let rev = 0;
    let init = num;

    while(num != 0){
        rem = num%10;
        rev = rev*10 + rem;
        num = Math.floor(num/10);
    }
    console.log(rev)
    return(rev == init)
}

console.log(palindrome(121))