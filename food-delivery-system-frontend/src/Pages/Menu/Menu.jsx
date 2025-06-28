import React from 'react'
import { Link } from 'react-router-dom'
import './Menu.css'
import FoodMenuCarousal from '../../Components/FoodMenuCarousal/FoodMenuCarousal'
import MenuList from './MenuList/MenuList'
const Menu = () => {
  return (
    <div className='MenuOuterMainSection'>
      <div className="MenuInnerMainSection">
        <div className="MenuIntroSection">
          <div className="pngs meat"></div>
          <div className="pngs soup"></div>
          <div className="pngs omlet"></div>
          <div className="pngs plant"></div>
          <div className="pngs chillies"></div>
          <div className="pngs coffeeBeans"></div>
          <div className="pngs flourBowl"></div>
          <div className="pngs leaves"></div>
          <div className="pngs Shawarma"></div>
          <div className="pngs flour"></div>
          <div className="pngs dessert"></div>
          <div className="IntroContent">
            <h1 className='menuHeadingH1'>Fast, tasty & served well</h1><br/>
            <p className='menuParap'>100% Healthy and Natural foods</p><br/><br/>
            <button><Link className='navLink' to="MenuList">See Full Menu</Link></button>
          </div>
        </div>
        <div className="FoodItemsMenu">
          <MenuList/>
        </div>
      </div>
    </div>
  )
}

export default Menu
