import React from 'react'
import { useState } from 'react'

const List = () => {
    const [list, setList] = useState([]);
    const [count, setCount] = useState(1);

    function addItem() {
        const itemName = `Item ${count}`;
        setList((previousState) => { return [
            ...previousState,
            itemName
        ]});
        setCount(count + 1);
    }

    return (
        <>
            <h1>Lists</h1>
            <button onClick={addItem}>Add Item</button>
            <ul>
                {
                    list.map((el,index) => <li key={index}>{el}</li>)
                }
            </ul>
        </>
    )
}

export default List