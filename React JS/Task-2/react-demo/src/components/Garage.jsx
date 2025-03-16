import React from 'react'
import Car from './car'
import Apple from './Apple'

const Garage = () => {
  const isDoorOpened = true;
  // const brand = "Ferrari"
  // const color = "Red"
  const carInfo = {brand: "Ferrari", color: "Red"};
  const appleInfo = {type: "Fuji", color: "Red"};
  // const carInfo = {};
  const showCarInfo = carInfo.brand !== undefined && carInfo.color !== undefined;
  const carList = [ 
    {brand: "BMW", color: "Blue"},
    {brand: "Ford", color: "Green"},
    {brand: "Tesla", color: "Black"},
  ]

  return (
    <>
        { isDoorOpened ? <h1>Garage Door is Open!</h1> : <h1>Garage Door is Closed!</h1> }
        <h1>Who lives inside my Garage?</h1>
        {/* <Car brand={brand} color={color} /> */}
        { showCarInfo && <Car carInfo={carInfo} /> }
        <Apple appleInfo={appleInfo} />
        <ul>
          { carList.map((carInfo, index) => <li key={index}><Car carInfo={carInfo} /></li>) }
        </ul>
    </>
  )
}

export default Garage