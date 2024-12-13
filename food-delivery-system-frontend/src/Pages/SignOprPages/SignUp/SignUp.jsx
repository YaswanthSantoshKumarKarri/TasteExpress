import React ,{useEffect, useState}from 'react'
import { NavLink,useNavigate } from 'react-router-dom'
import "./SignUp.css"
import ClientServices from '../../../Services/ClientServices'

const SignUp = () => {
    const [ClientData,setClientData]=useState({
        id : "",
        name: "",
        emailId:"",
        password : "",
        address : "",
        phoneNumber : ""
    })
    const navigate = useNavigate();
    const [confirmPass,setConfirmPass]=useState();
    const handleInputChange=(event)=>{
        const name=event.target.name;
        const val=event.target.value;
        setClientData({ ...ClientData, [name]: val  });
    }
    const handleConfirmPassChange=(event)=>{
        setConfirmPass(event.target.value);
    }
    const [fetchedClientData,setFetchedClientData]=useState();
    const handleSubmitBtn=(e)=>{
        e.preventDefault();
        if(confirmPass===ClientData.password){
            ClientServices.saveClient(ClientData).then(Response=>{
                setFetchedClientData(Response.data);
            })
            
        }else{
            alert("password and Confirm password mismatch")
        }
    }
    useEffect(() => {
        if(fetchedClientData!==undefined){
          alert(fetchedClientData);
          if(fetchedClientData==="Registration is successful"){
            navigate('/LogIn');
          }
        }
      },[fetchedClientData]);

  return (
    <div className='LogInMainOuterSection'>
        <div className="LogInnerMainInnerSection">
            <div className="leftOuterLogInMainInnerSection">
                <div className="leftInnerLogInMainInnerSection">
                    <h1 className='h1TagleftInnerLogInMainInnerSection'>SignUp Here</h1>
                    <form className='formOfLoginPage' action="">
                        <input type="text" name='id' onChange={handleInputChange} placeholder='ClientId' required/><br/>
                        <input type="text" name='name' onChange={handleInputChange} placeholder='clientName' required/><br/>
                        <input type="password" name='password' onChange={handleInputChange} placeholder='Password' required/><br/>
                        <input type="password" name='confirmPassword' onChange={handleConfirmPassChange} placeholder='Confirm Password' required/><br/>
                        <input type="text" name='address' onChange={handleInputChange} placeholder='Address' required/><br/>
                        <input type="email" name='emailId' onChange={handleInputChange} placeholder='EmailId' required/><br/>
                        <input type="number" name='phoneNumber' style={{width:"250px"}} onChange={handleInputChange} placeholder='Phone Number' required/><br/>

                        <button className='btnLogInPage' onClick={handleSubmitBtn}>Submit</button>
                    </form>
                    <p>Already have an Account <NavLink className="navLink" to="/logIn">click Here</NavLink></p>
                </div>
            </div>
            <div className="rightOuterLogInMainInnerSection">
                <div className="rightInnerLogInMainInnerSection">
                    <h1 className='h1TagleftInnerLogInMainInnerSection'>Welcome to <br/><span>TasteExpress</span></h1>
                    <p> Bridging complaints to solutions in the realm of electronics.</p>
                </div>
            </div>
        </div>
    </div>
  )
}

export default SignUp
