import React from "react";
import "./Contato.css"

const Contato = () => {
  return( <>

<div class="container rounded bg-white mt-5 mb-5">
  <div class="row">

  <div class="col-md-5 border-right">
      <div class="d-flex flex-column align-items-center text-center p-3 py-5"><img class="rounded-circle mt-5" width="150px" src="../pics/logoviagens.png"/></div>
  </div>

      <div class="col-md-7 border-right">
          <div class="p-3 py-5">
              <div class="d-flex justify-content-between align-items-center mb-3">
                  <h4 class="text-right">Entre em Contato</h4>
              </div>
              <div class="row mt-3">
                  <div class="col-md-12"><label class="labels">Nome</label><input type="text" class="form-control" placeholder="Rebeca" value=""/></div>
                  <div class="col-md-12"><label class="labels">Email</label><input type="text" class="form-control" placeholder="rebeca@gmail.com" value=""/></div>
                  <div class="col-md-12"><label class="labels">Logradouro</label><input type="text" class="form-control" placeholder="Rua das Flores" value=""/></div>
                  <div class="col-md-12"><label class="labels">Bairro</label><input type="text" class="form-control" placeholder="Iputinga" value=""/></div>
                  <div class="col-md-12"><label class="labels">Cidade</label><input type="text" class="form-control" placeholder="Recife" value=""/></div>
                  <div class="col-md-12"><label class="labels">UF</label><input type="text" class="form-control" placeholder="PE" value=""/></div>
                  <div class="col-md-12"><label class="labels">Data de Nascimento</label><input type="text" class="form-control" placeholder="12/12/1993" value=""/></div>
                  <div class="col-md-12"><label class="labels">Mensagem</label><textarea class="form-control" id="exampleFormControlTextarea1" rows="10"></textarea></div>
                 
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

export default Contato;
