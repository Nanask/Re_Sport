import React from "react";
import { Link } from "react-router-dom";
import "../../css/main/main.css";

const Main = () => {
  return (
    <div>
      <div id="s_left"></div>
      <div id="s_right"></div>
      <section class="contents">
        <h2>FIRST PROJECT GPC</h2>
        <div class="sq_box"></div>
        <div class="main_box">
          <div id="box1">
            <Link to="/search"></Link>
            <i class="fas fa-search fa-7x"></i>
            <h1>search</h1>
          </div>
          <div id="box2">
            <i class="fas fa-map-marked-alt fa-7x"></i>
            <h1>map</h1>
          </div>
          <div id="box3">
            <i class="fas fa-edit fa-7x"></i>
            <h1>Q&A</h1>
          </div>
        </div>

        <p class="text1">
          우리 주변에 체육시설을 감색과 위치, 지도를 사용해
          <br />
          빠르고 정확하게 찾을 수 있게 도와드립니다
        </p>

        <footer>CopyRight&copy;GPC2021@gamil.com</footer>
      </section>
    </div>
  );
};

export default Main;
