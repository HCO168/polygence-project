import React, { Component } from 'react';
import '../App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import TopBar from "./components/TopBar";
import LoginCard from "./components/LoginCard";

class Read extends Component {
    render() {
        return (
            <div>
                <TopBar/>
                Welcome to EasyMean,
                <div className="d-flex justify-content-center">
                    <LoginCard/>
                </div>
            </div>
        );
    }
}
export default Home;