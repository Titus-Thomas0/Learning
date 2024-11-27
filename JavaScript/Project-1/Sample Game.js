// 0 = Rock
// 1 = Paper
// 2 = Scissors

const player = 2;
let computer = Math.floor(Math.random() * 3);

let playPick;
let compPick;
let playScore = 0;
let compScore = 0;
let result;

console.log(computer);

while (playScore < 10 && compScore < 10) {
    if (player === 0) {
        playPick = 'Rock';
        if (computer === 0) {
            compPick = 'Rock';
            result = 'DRAW';
        }
        else if (computer === 1) {
            compPick = 'Paper';
            result = 'The computer won!';
            compScore = compScore + 1;
        }
        else if (computer === 2) {
            compPick = 'Scissors';
            result = 'The player won!';
            playScore = playScore + 1;
        }
        else {
            compPick = 'Error';
            result = 'An error occured';
        }
    }
    
    if (player === 1) {
        playPick = 'Paper';
        if (computer === 0) {
            compPick = 'Rock';
            result = 'The player won!';
            playScore = playScore + 1;
        }
        else if (computer === 1) {
            compPick = 'Paper';
            result = 'DRAW';
        }
        else if (computer === 2) {
            compPick = 'Scissors';
            result = 'The computer won!';
            compScore = compScore + 1;
        }
        else {
            compPick = 'Error';
            result = 'An error occured';
        }
    }
    
    if (player === 2) {
        playPick = 'Scissors';
        if (computer === 0) {
            compPick = 'Rock';
            result = 'The computer won!';
            compScore = compScore + 1;
        }
        else if (computer === 1) {
            compPick = 'Paper';
            result = 'The player won!';
            playScore = playScore + 1;
        }
        else if (computer === 2) {
            compPick = 'Scissors';
            result = 'DRAW';
        }
        else {
            compPick = 'Error';
            result = 'An error occured';
        }
    }
    
    console.log('Player picked: ' + playPick);
    console.log('Computer picked: ' + compPick);
    console.log(result);
    console.log(compScore + 'vs' + playScore);
    computer = Math.floor(Math.random() * 3);
}

if (playScore === 10) {
    console.log('The player won the match!');
}
else if (compScore === 10) {
    console.log('The computer won the match!');
}
else {
    console.log('An error occured');
}