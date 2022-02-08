import React, {useState} from "react";
import data from "./components/back/Data/Data";
import Header from "./components/front/Header/Header";
import { BrowserRouter as Router } from "react-router-dom";
import Rotas from "./components/front/Rotas/Rotas";

 
const App = () => {
  const{productItems} = data;
  const{cartItems, setCartItems} = useState([]);
  
  const handleAddProduct =(product) =>{
    const ProductExist = cartItems.find((item) => item.id === product.id);
    if (ProductExist){
      setCartItems(
        cartItems.map((item) =>
        item.id === product.id 
        ? {...ProductExist, quantity:ProductExist.quantity +1}
        :item
        )
      );
    } else{
      setCartItems([...cartItems, {...product, quantity:1}]);
    }
  };


  return(<div>

    <Router>
    <Header/>
    
    <Rotas handleAddProduct={handleAddProduct} productItems={productItems} cartItems={cartItems} />
  
    </Router>
  
  </div>);
};

export default App;
