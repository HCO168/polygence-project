import React from 'react';
import { Nav, NavItem, NavLink } from 'reactstrap';

export default function TopNav() {
    return (
        <Nav TopNav>
            <NavItem><NavLink href="/">Home</NavLink></NavItem>
            <NavItem><NavLink href="/read">Read</NavLink></NavItem>
            <NavItem><NavLink href="/quiz">Quiz</NavLink></NavItem>
            <NavItem><NavLink href="/users">Users</NavLink></NavItem>
            <NavItem><NavLink href="/definition">Definition</NavLink></NavItem>
        </Nav>
    );
}
