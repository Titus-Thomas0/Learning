import { useEffect, useState } from 'react'
import { Button, EditableText, InputGroup, Toaster } from '@blueprintjs/core'
import './App.css'

// const AppToaster = Toaster.create({
//   position: "top"
// })

function App() {
  const [user, setUser] = useState([]);
  const [newName, setNewName] = useState("");
  const [newEmail, setNewEmail] = useState("");
  const [newWebsite, setNewWebsite] = useState("");

  useEffect(() => {
    fetch('https://jsonplaceholder.typicode.com/users')
    .then((response) => response.json() )
    .then((json) => setUser(json))
  },[])

  function addUser() {
    const name = newName.trim();
    const email = newEmail.trim();
    const website = newWebsite.trim();

    if (name && email && website) {
      fetch('https://jsonplaceholder.typicode.com/users',
        {
          method: "POST",
          body: JSON.stringify({
            name,
            email,
            website
          }),
          headers: {
            "content-Type": "application/json; charset=UTF-8"
          }
        }
      ).then((response) => response.json() )
      .then(data => {
        setUser([...user, data]);
        // AppToaster.show({
        //   message: "User added successfully",
        //   intent: 'success',
        //   timeout: 3000
        // })
        setNewName("");
        setNewEmail("");
        setNewWebsite("");
      })
    }
  }

  function onChangeHandler(id, key, value) {
    setUser((user) => {
      return user.map(user => {
        return user.id === id ? {...user, [key]: value} : user;
      })
    })
  }

  function updateUser(id) {
    const user = user.find((user) => user.id === id);

    fetch(`https://jsonplaceholder.typicode.com/users/${id}`,
      {
        method: "PUT",
        body: JSON.stringify(user),
        headers: {
          "content-Type": "application/json; charset=UTF-8"
        }
      }
    ).then((response) => response.json() )
    .then(data => {
      setUser([...user, data]);
      // AppToaster.show({
      //   message: "User updated successfully",
      //   intent: 'success',
      //   timeout: 3000
      // })
    })
  }

  function deleteUser(id) {
    fetch(`https://jsonplaceholder.typicode.com/users/${id}`,
      {
        method: "DELETE"
      }
    ).then((response) => response.json() )
    .then(() => {
      setUser((user) => {
        return user.filter(user => user.id !== id)
      });
      // AppToaster.show({
      //   message: "User deleted successfully",
      //   intent: 'success',
      //   timeout: 3000
      // })
    })
  }

  return (
    <>
      <table className='bp4-html-table modifier'>
        <thead>
          <th>ID</th>
          <th>Name</th>
          <th>Email</th>
          <th>Website</th>
          <th>Action</th>
        </thead>
        <tbody>
          {user.map(user => 
            <tr key={user.id}>
            <td>{user.id}</td>
            <td>{user.name}</td>
            <td><EditableText onChange={value => onChangeHandler(user.id, 'email', value)} value={user.email} /></td>
            <td><EditableText onChange={value => onChangeHandler(user.id, 'website', value)} value={user.website} /></td>
            <td>
              <Button intent='primary' onClick={() => updateUser(user.id)}>Update</Button>
              &nbsp;
              <Button intent='danger' onClick={() => deleteUser(user.id)}>Delete</Button>
            </td>
          </tr>
          )}
        </tbody>
        <tfoot>
          <tr>
            <td></td>
            <td>
              <InputGroup
                value={newName}
                onChange={(e) => setNewName(e.target.value) }
                placeholder='Enter Name...'
              />
            </td>
            <td>
              <InputGroup
                value={newEmail}
                onChange={(e) => setNewEmail(e.target.value) }
                placeholder='Enter Email...'
              />
            </td>
            <td>
              <InputGroup
                value={newWebsite}
                onChange={(e) => setNewWebsite(e.target.value) }
                placeholder='Enter Website...'
              />
            </td>
            <td>
              <Button intent='success' onClick={addUser}>Add User</Button>
            </td>
          </tr>
        </tfoot>
      </table>
    </>
  )
}

export default App