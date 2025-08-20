import React, { Component } from 'react';
import '../App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import {Button, Input, InputGroup, Nav, NavItem, NavLink} from "reactstrap";
import TopNav from "./components/TopNav";
import TopBar from "./components/TopBar";

class Definition extends Component {
    render() {
        return (
            <div>
                <TopBar/>
                <InputGroup className="mx-auto" style={{ width: 'max(50%, min(100%,1000px))' }}>
                    <Input/>
                    <Button>
                        Search
                    </Button>
                </InputGroup>
            </div>
        );
    }
}
export default Definition;