import { useState } from 'react'
import './App.css'
import Result from './components/Result';
const secretNumber = Math.floor(Math.random() * 10) + 1;

function App() {
  const [term, setTerm] = useState("");

  const handleChange = (e) => {
    setTerm(e.target.value)
  }

  return (
    <>
      <div className='container'>
        <div className='head'>
          <label htmlFor="term">
            Guess the number between 1 to 10
          </label>
        </div>
        <input 
          type="text" 
          id='term'
          name='term'
          onChange={handleChange}
        />
        <Result secretNumber={secretNumber} term={term} />
      </div>
    </>
  )
}

export default App
