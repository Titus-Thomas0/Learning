import React from 'react'
import './header.css'
import styles from './header.module.css';

const Header = () => {
    const myStyle = {
        color: "red",
        backgroundColor: "lightblue",
        padding: "10px",
        fontFamily: "Sans-serif"
    }
    return (
        <>
            <h1 style={ myStyle }>Hello Styling!</h1>
            <h2 className={styles.bigBlue}>Hello styling from stylesheet!</h2>
            <p>Add a little style</p>
        </>
    )
}

export default Header