// import "./App.css";
import Main from "./comp/main/Main";
import Nav from "./comp/main/Nav";
import { BrowserRouter, Route, Link } from "react-router-dom";
import Search from "./comp/search/Search";
import Map from "./comp/map/Map";
import Login from "./comp/member/Login";
import Join from "./comp/member/Join";

function App() {
  return (
    <BrowserRouter>
      <div>
        <Nav />
        <Link to="/">
          <Main />
        </Link>
        <Link to="/">
          <Search />
        </Link>
        {/* <Route path="/" component={Main} exact></Route>
        <Route path="/search" component={Search} exact></Route>
        <Route path="/Map" component={Map} exact></Route>
        <Route path="/login" component={Login} exact></Route>
        <Route path="/join" component={Join} exact></Route> */}
      </div>
      <Main />
    </BrowserRouter>
  );
}

export default App;
