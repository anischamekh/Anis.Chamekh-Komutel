import React from "react";
import {
  BrowserRouter as Router,
  Route,
  Routes,
} from "react-router-dom";
import Contact from "./Components/Contacts/Contact";
import './App.css';

function App() {
  return (
    <div className="App">
     <Router>
     <Routes>
        <Route path="/" element={<Contact/>} />
        </Routes>
      </Router>

    </div>
  );
}

export default App;
