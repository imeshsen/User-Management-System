import "./App.css";
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";
import Navbar from "./layout/Navbar";
import Home from "./pages/Home";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import AddUser from "./users/AddUser";
import EditUser from "./users/EditUser";
import ViewUser from "./users/ViewUser";

function App() {
  return (
    <div className="App">
      <Router>
        <Navbar />
        <Routes>
          <Route exact path="/" element={<Home />}></Route>
          <Route exact path="/add" element={<AddUser />}></Route>
          <Route exact path="/edit/:id" element={<EditUser />}></Route>
          <Route exact path="/view/:id" element={<ViewUser />}></Route>
        </Routes>
      </Router>
    </div>
  );
}

export default App;
