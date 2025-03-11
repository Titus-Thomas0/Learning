//"racecar"
//"madam"
//"moonlight"
//"aviary"

function ispalindrome(word) {
    let reverseWord = "";
    let lowerCase = word.toLowerCase();

    for (let i = lowerCase.length - 1; i >= 0; i--) {
        reverseWord += lowerCase[i];
    }

    return reverseWord === lowerCase;
}

console.log(ispalindrome("racecar"));
console.log(ispalindrome("madam"));
console.log(ispalindrome("moonlight"));
console.log(ispalindrome("aviary"));