import React from 'react'
import { useNavigate } from 'react-router-dom'

const Login = () => {
    const navigate = useNavigate();

    function onSubmit() {
        //Code here
        navigate('/dashboard')
    }

    return (
        <>
            <h1>Login Page</h1>
            <button onClick={onSubmit}>Login</button>
        </>
    )
}

export default Login