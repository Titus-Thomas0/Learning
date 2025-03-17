import React from 'react'
import { useState } from 'react';

const Scooter = () => {
    // const [color, setColor] = useState("Navy Blue");
    // const [brand, setBrand] = useState("OLA");
    // const [model, setModel] = useState("S1 Pro Gen2");
    // const [year, setYear] = useState("2024");
    const [scooter, setScooter] = useState({
        color: "Navy Blue",
        brand: "OLA",
        model: "S1 Pro Gen2",
        year: "2024"
    });

    function changeColor() {
        setScooter(previousState => {
            return {
                ...previousState,
                color: "Black",
            };
        });
    }

    return (
        <>
            <h1>My Scooter</h1>
            <p>Color: {scooter.color}</p>
            <p>Brand: {scooter.brand}</p>
            <p>Model: {scooter.model}</p>
            <p>Year: {scooter.year}</p>
            <button onClick={changeColor}>Change Color</button>
        </>
    )
}

export default Scooter