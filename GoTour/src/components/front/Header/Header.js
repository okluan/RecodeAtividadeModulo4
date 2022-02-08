import React from "react";
import { Link } from "react-router-dom";
import "./Header.css";


const Header = () => {
  return (
  <>
    <header>
    <nav className="navbar navbar-expand-lg navbar-light">
    <div className="container-fluid">
        <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span className="navbar-toggler-icon"></span>
        </button>
        <div className="collapse navbar-collapse" id="navbarNav">
            <div className="nav">
                <div className="navLeft">
                    <h3>Go Tour</h3>
                </div>
                <div className="navRight">
                    <ul>
                        <li>
                            <Link to="/">
                                <a>Home</a>
                            </Link>
                        </li>
                        <li>
                            <Link to="/destino">
                                <a >Destino</a>
                            </Link>
                        </li>
                        <li>
                            <Link to="/contato">
                                <a >Contato</a>
                            </Link>
                        </li>
                        
                    </ul>
                </div>
            </div>
        </div>
    </div>
</nav>

</header>
</> 
  );
};

export default Header;
