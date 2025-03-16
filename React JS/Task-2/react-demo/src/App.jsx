import './App.css'
import CarClass from './components/CarClass'
import FavoriteColor from './components/FavoriteColor'
import Garage from './components/Garage'
import Header from './components/header'
import List from './components/List'
import MyForm from './components/MyForm'
import Scooter from './components/Scooter'
import Timer from './components/Timer'

function App() {

  return (
    <>
      <Header />
      <Garage />
      <FavoriteColor />
      <CarClass />
      <Scooter />
      <List />
      <Timer />
      <MyForm />
    </>
  )
}

export default App