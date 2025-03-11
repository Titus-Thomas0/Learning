const myNumber = 25;
let binary = "";

for (let i = myNumber; i > 0 ; i = Math.floor(i/2)) {
    if (i == 1) {
        binary = '1' + binary;
    }
    else if (i % 2 ==0) {
        binary = "0" + binary;
    }
    else {
        binary = "1" + binary;
    }
}
console.log('With for loop: ' + binary);