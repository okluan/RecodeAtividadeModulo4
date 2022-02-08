import React from "react";
import "./Destino.css"

const Destino = () => {
  return( <>
  

  <div class="container rounded bg-white mt-5 mb-5">
  <div class="row">

  <div class="col-md-5 border-right">
      <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5" width="150px" src="../pics/mala.jpg"/></div>
  </div>

      <div class="col-md-7 border-right">
          <div class="p-3 py-5">
              <div class="d-flex justify-content-between align-items-center mb-3">
                  <h4 class="text-right">Insira Dados Pessoais e de Roteiro</h4>
              </div>
              <div class="row mt-3">
                  <div class="col-md-12"><label class="labels">CPF</label><input type="text" class="form-control" placeholder="000.000.000-00" value=""/></div>
                  <div class="col-md-12"><label class="labels">Cidade</label><input type="text" class="form-control" placeholder="Recife" value=""/></div>
                  <div class="col-md-12"><label class="labels">UF</label><input type="text" class="form-control" placeholder="PE" value=""/></div>
                  <div class="col-md-12"><label class="labels">Valor</label><input type="text" class="form-control" placeholder="1.012,0" value=""/></div>
                  <div class="col-md-12"><label class="labels">Hotel</label><input type="text" class="form-control" placeholder="Águas Belas" value=""/></div>
                  <div class="col-md-12"><label class="labels">Embarque</label><input type="text" class="form-control" placeholder="12/11/2021" value=""/></div>
                  <div class="col-md-12"><label class="labels">Desembarque</label><input type="text" class="form-control" placeholder="12/12/2021" value=""/></div>
                  <div class="col-md-12"><label class="labels">Parcelas</label><input type="text" class="form-control" placeholder="2" value=""/></div>
                  <div class="col-md-12"><label class="labels">Pessoas</label><input type="text" class="form-control" placeholder="3" value=""/></div>
                 
              </div>
              <div class="mt-5 text-center"><button class="btn btn-warning" type="button">Enviar</button></div>
          </div>
      </div>

  </div>
</div>




  <footer className="footersignup mt-auto py-3 bg-light">
  <div className="container">
    <span className="text-muted">Go Tour.</span>
  </div>
</footer>
  
  </>
  
  )
};

export default Destino;
