
import React from "react"
import { Route, Routes } from "react-router-dom";
import Products from "../Products/Products";
import Destino from "../Destino/Destino";
import Contato from "../Contato/Contato";

const Rotas = ({productItems, cartItems, handleAddProduct}) => {
  return (<div>
      <Routes>

      <Route exact path="/" element={<Products productItems = {productItems} handleAddProduct ={handleAddProduct}/>} />
      
      <Route exact path='/destino' element={<Destino/>}/>
      <Route exact path='/contato' element={<Contato/>}/>
     


      </Routes>
  </div>);
};

export default Rotas;
