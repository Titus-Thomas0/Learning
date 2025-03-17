import React, { useEffect, useState } from 'react'

const Timer = () => {
    const [count,setCount] = useState(0);

    useEffect(() => {
        // checkCount();
        setTimeout(() => {
            setCount((previousState) => { return previousState+1 });
        }, 1000)
    })

    // function checkCount() {
    //     if(count > 10) {
    //         setCount(1);
    //     }
    // }

    function updateCount() {
        setCount((previousState) => { return previousState+1 });
    }

    return (
        <>
            <h1>I have rendered {count} timer!</h1>
            <button onClick={updateCount}>Increment</button>
        </>
    )
}

export default Timer