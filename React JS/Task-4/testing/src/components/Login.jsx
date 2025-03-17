import React from 'react'
import { useState } from 'react'

const Login = () => {
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");
  const [message, setMessage] = useState("");

  function signInHandler() {
    setMessage('Loading...')
    if(email == 'tttitus99@gmail.com' && password == 'test@123') {
      setTimeout(() => {
        setMessage('Successfully Loggedin!')
      }, 3000)
    }
    else {
      setTimeout(() => {
        setMessage('Invalid credentials!')
      }, 3000)
    }
  }

  return (
    <div>
        <h1>Login</h1>
        <input type="text" placeholder='Email' onChange={(e) => setEmail(e.target.value) } /> <br />
        <input type="text" placeholder='Password' onChange={(e) => setPassword(e.target.value) } /> <br />
        <button type="button" onClick={signInHandler}>Signin</button>
        {message && <p>{message}</p>}
    </div>
  )
}

export default Login