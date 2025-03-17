import React from 'react'
import { useState } from 'react';

const FavoriteColor = () => {
    // let color = "Blue";
    const [color, setColor] = useState("Blue");

    return (
        <>
            <h1>My Favorite color is {color}.</h1>
            <button type="button" onClick={() => { setColor("Red") }}>Change Color</button>
        </>
    )
}

export default FavoriteColor