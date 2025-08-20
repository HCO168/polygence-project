import './App.css';
import React from "react";
import {BrowserRouter, Route, Routes} from "react-router-dom";
import Home from "./pages/Home";
import UserList from "./pages/UserList";
import UserEdit from "./pages/UserEdit";
import Definition from "./pages/Definition";


class App extends React.Component {
    render() {
        return (
            <div className="App">
                <BrowserRouter>
                    <Routes>
                        <Route exact path="/" element={<Home />} />
                        <Route exact path='/UserList' element={<UserList />}/>
                        <Route exact path='/UserEdit' element={<UserEdit />}/>
                        <Route exact path='/Definition' element={<Definition/>}/>
                    </Routes>
                </BrowserRouter>
            </div>
        );
    }
}

export default App;
