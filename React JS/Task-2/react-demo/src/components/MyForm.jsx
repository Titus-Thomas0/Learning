import React, { useState } from 'react'

const MyForm = () => {
    // const [name, setName] = useState('');
    // const [age, setAge] = useState('');
    // const [email, setEmail] = useState('');
    const [inputs, setInputs] = useState({phone: '+91', email: '@gmail.com', message: 'Im a engineer'});

    function handleSubmit(e) {
        e.preventDefault();
        console.log('Form Submitted');
        console.log(inputs);
    }

    function handleChange(e) {
        const name = e.target.name;
        const value = e.target.value;
        setInputs((previousState) => {return {...previousState, [name]: value}});
    }

    return (
        <form action="" onSubmit={handleSubmit}>
            <label>Enter your name: <input type="text" name='name' onChange={handleChange} /></label>
            <label>Enter your age: <input type="text" name='age' onChange={handleChange} /></label>
            <label>Enter your email: <input type="email" name='email' onChange={handleChange} value={inputs.email} /></label>
            <label>Enter your phone: <input type="text" name='phone' onChange={handleChange} value={inputs.phone} /></label>
            <label>Enter your country: 
                <select name='country' onChange={handleChange} value={inputs.country}>
                    <option value="">Select</option>
                    <option value="Australia">Australia</option>
                    <option value="India">India</option>
                    <option value="USA">USA</option>
                </select>
            </label>
            <label>Enter your message: <textarea name='message' onChange={handleChange} value={inputs.message}></textarea></label>
            <input type="submit" value="Submit Form" />
        </form>
    )
}

export default MyForm