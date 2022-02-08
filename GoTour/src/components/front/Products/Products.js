import React from "react";
import "./Products.css"



const Products = ({productItems}) => {
  return (

    
      <>

      
      <div id="carouselExampleDark" className="carousel carousel-dark slide" data-bs-ride="carousel">
    <div className="carousel-indicators">
      <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
      <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="1" aria-label="Slide 2"></button>
      <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="2" aria-label="Slide 3"></button>
    </div>
    <div className="carousel-inner">
      <div className="carousel-item active" data-bs-interval="10000">
        <img src= "./pics/ceara.jpg"className="d-block w-100 h-90" alt="..."/>
        <div className="carousel-caption d-none d-md-block">
        </div>
      </div>
      <div className="carousel-item" data-bs-interval="2000">
        <img src="./pics/fernando.jpg" className="d-block w-100 h-90" alt="..."/>
        <div className="carousel-caption d-none d-md-block">
          
        </div>
      </div>
      <div className="carousel-item">
        <img src="./pics/riodejaneiro.jpg" className="d-block w-100 h-90" alt="..."/>
        <div className="carousel-caption d-none d-md-block">
        
        </div>
      </div>
    </div>
    <button className="carousel-control-prev" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="prev">
      <span className="carousel-control-prev-icon" aria-hidden="true"></span>
      <span className="visually-hidden">Previous</span>
    </button>
    <button className="carousel-control-next" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="next">
      <span className="carousel-control-next-icon" aria-hidden="true"></span>
      <span className="visually-hidden">Next</span>
    </button>
  </div>

      <h2>Roteiros Disponíveis</h2>
     
        <div className="products">
            
            {productItems.map((productItem) => (
            <div className="card">
                <div>

                    <img className="product-image"
                    src={productItem.image}
                    alt={productItem.name} 
                    />
 </div>

  <div>
      <h3 className="product-name">
          {productItem.name}
          </h3> 
          <h3 className="product-local">
          {productItem.local}
          </h3>
 </div>

 <div className="product-price"> R$ {productItem.price}</div>

<div>
    <button className="product-add-button">Ver mais</button>
</div>
 </div>

)





)}

</div>

<div class="container" id ="titulo">
  </div>
<footer className="footer mt-auto py-3 bg-light">
  <div className="container">
    <span className="text-muted">Go Tour.</span>
  </div>
</footer>

</>
  )

}

export default Products;
