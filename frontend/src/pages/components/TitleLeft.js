import React from 'react';
import {Nav, NavbarBrand, NavItem, NavLink} from 'reactstrap';

export default function TitleLeft() {
    return (
        <NavbarBrand>
            <img src="/res/top/topLeftTitle.png" alt="[Website Icon]" style={{ height: '1.3em' }} className="me-2"/>
            <text>EasyMean</text>
        </NavbarBrand>
    );
}
