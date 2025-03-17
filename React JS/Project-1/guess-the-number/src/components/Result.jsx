import React from 'react'

const Result = ({secretNumber, term} ) => {
    let result;

    if(term) {
        if (term > secretNumber) {
            result = 'Higher';
        }
        else if (term < secretNumber) {
            result = 'Lower';
        }
        else if (term == secretNumber) {
            result = 'Yipee! Correct';
        }
        else {
            result = 'Enter valid number';
        }
    
    }
    
    return (
        <h3>You guessed: {result}</h3>
    )
}

export default Result