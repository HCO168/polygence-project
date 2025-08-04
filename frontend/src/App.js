import './App.css';
import React from "react";
import {BrowserRouter, Route, Routes} from "react-router-dom";
import Home from "./pages/Home";
import UserList from "./pages/UserList";
import UserEdit from "./pages/UserEdit";


class App extends React.Component {
    render() {
        return (
            <div className="App">
                <BrowserRouter>
                    <Routes>
                        <Route exact path="/" element={<Home />} />
                        <Route exact path='/users' element={<UserList />}/>
                        <Route path='/users/:username' element={<UserEdit />}/>
                    </Routes>
                </BrowserRouter>
            </div>
        );
    }
}

export default App;
