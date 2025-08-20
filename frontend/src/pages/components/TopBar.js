import React from 'react';
import {Navbar} from 'reactstrap';
import TitleLeft from "./TitleLeft";
import TopNav from "./TopNav";

export default function TopBar() {
    return (
        <Navbar color="light" light expand="md" className="px-3 justify-content-start">
            <TitleLeft/>
            <TopNav/>
        </Navbar>
    );
}
