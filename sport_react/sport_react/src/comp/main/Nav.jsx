import React from "react";
import "../../css/main/nav.css";
import MainLogo from "../../image/logo.png";

const Nav = () => {
  return (
    <nav id="main_nav">
      <img src={MainLogo}></img>
      <ul>
        <li>Search</li>
        <li>Map</li>
        <li>
          instagram <i class="fab fa-instagram fa-lg"></i>
        </li>
        <li>
          Login <i class="fas fa-user-circle fa-lg"></i>
        </li>
        <li>
          Join <i class="fas fa-pencil-alt fa-lg"></i>
        </li>
      </ul>
    </nav>
  );
};

export default Nav;
