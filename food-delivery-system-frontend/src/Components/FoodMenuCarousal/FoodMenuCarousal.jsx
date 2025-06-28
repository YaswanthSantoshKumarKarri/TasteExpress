import React,{useEffect,useState} from 'react'
// import "slick-carousel/slick/slick.css";
// import "slick-carousel/slick/slick-theme.css";
// import Slider from "react-slick";

import './FoodMenuCarousal.css'

const FoodMenuCarousal = () => {
  
  const [FetchedReviews, setFetchedReviews] = useState([]);
  // useEffect(() => {
  //   setTimeout(() => {
  //     CommonServices.getAllFoods().then(Response=>{
  //       setFetchedReviews(Response.data)
  //       console.log(Response.data)
  //     })
  //   }, 1000);
  // });

  const settings = {
    dots: true,
    infinite: true,
    speed: 500,
    slidesToShow: 3,
    slidesToScroll: 3
  };
  const slider = React.useRef(null);

  return (
    <div className='MainCustomersCarousal'>
      <h1 className='MainMenuHeadingH1'>Our Menu</h1>
      <div className="InnerCustomersCarousal">
      {/* 
      <Slider ref={slider} className='Slider' {...settings}>
      {FetchedReviews.map((row, index) => (
        <div key={index}>
        <div className='innersliderDiv'>
         
          <h3>{row.itemMakingTime}</h3>
          <div className='image'><img width="200px" height='200px' src={row.itemImg}/></div>
          <div className="itemNameAndCost">
            <h3>{row.itemName}</h3>
            <h3>${row.itemCost}</h3>
          </div> 
          <p>{row.itemDescription}</p>
          <div className="quantityAndTime">
            <h4>
              <svg width="18px" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="w-6 h-6">
                <path stroke-linecap="round" stroke-linejoin="round" d="M12 3v17.25m0 0c-1.472 0-2.882.265-4.185.75M12 20.25c1.472 0 2.882.265 4.185.75M18.75 4.97A48.416 48.416 0 0 0 12 4.5c-2.291 0-4.545.16-6.75.47m13.5 0c1.01.143 2.01.317 3 .52m-3-.52 2.62 10.726c.122.499-.106 1.028-.589 1.202a5.988 5.988 0 0 1-2.031.352 5.988 5.988 0 0 1-2.031-.352c-.483-.174-.711-.703-.59-1.202L18.75 4.971Zm-16.5.52c.99-.203 1.99-.377 3-.52m0 0 2.62 10.726c.122.499-.106 1.028-.589 1.202a5.989 5.989 0 0 1-2.031.352 5.989 5.989 0 0 1-2.031-.352c-.483-.174-.711-.703-.59-1.202L5.25 4.971Z" />
              </svg>
              {row.quantity}
            </h4>
            <h4>
              <svg width="18px" xmlns="http://www.w3.org/2000/svg" fill="none" viewBox="0 0 24 24" stroke-width="1.5" stroke="currentColor" class="w-6 h-6">
                <path stroke-linecap="round" stroke-linejoin="round" d="M12 6v6h4.5m4.5 0a9 9 0 1 1-18 0 9 9 0 0 1 18 0Z" />
              </svg>
              {row.itemCost}
            </h4>
          </div>
          <button>Order Now</button>
        </div>
        </div>
      ))}
    </Slider>

    */}
    </div>
    </div>    
  );
}



export default FoodMenuCarousal