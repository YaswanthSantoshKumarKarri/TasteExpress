import './App.css';
import {Routes,Route} from 'react-router-dom';
import Home from "./Pages/Home/Home"
import NavBar from './Components/NavBar/NavBar';
import Footer from './Components/Footer/Footer';
import LogIn from './Pages/SignOprPages/LogIn/LogIn';
import SignUp from './Pages/SignOprPages/SignUp/SignUp';
import Menu from './Pages/Menu/Menu';
import AboutUsPage from './Pages/AboutUsPage/AboutUsPage'
import MenuList from './Pages/Menu/MenuList/MenuList';
import DashBoard from './Pages/Dashboard/DashBoard';
function App() {
  return (
    <div className="App">
      <NavBar/>
      <Routes>
        <Route path='/logIn' element={<LogIn />}/>
        <Route path='/SignUp' element={<SignUp />}/>
        <Route path='/AboutUs' element={<AboutUsPage />}/>
        <Route path='/' element={<Home />}/>
        <Route path='/Menu' element={<Menu />}/>
        <Route path='/Menu/MenuList' element={<MenuList/> }/>
         <Route path='/Dash-board' element={<DashBoard/> }/>
      </Routes>
      <Footer/>
    </div>
  );
}

export default App;
