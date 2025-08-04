import React, { Component } from 'react';
import { useNavigate, useParams } from 'react-router-dom';
import { Button, Container, Form, FormGroup, Input, Label } from 'reactstrap';
import AppNavbar from "../components/AppNavBar";

class UserEdit extends Component {

    emptyItem = {
        username: '',
        firstName: '',
        lastName: ''
    };

    constructor(props) {
        super(props);
        this.state = {
            item: this.emptyItem
        };
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    async componentDidMount() {
        if (this.props.params.username !== 'new') {
            const user = await (await fetch(`/users/${this.props.params.username}`)).json();
            this.setState({ item: user });
        }
    }

    handleChange(event) {
        const target = event.target;
        const value = target.value;
        const name = target.name;
        let item = { ...this.state.item };
        item[name] = value;
        this.setState({ item });
    }

    async handleSubmit(event) {
        event.preventDefault();
        const { item } = this.state;

        await fetch('/users' + (item.username ? '/' + item.username : ''), {
            method: item.username ? 'PUT' : 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(item),
        });
        this.props.navigate('/users');
    }

    render() {
        const { item } = this.state;
        const title = <h2>{item.username ? 'Edit User' : 'Add User'}</h2>;

        return (
            <div>
                <AppNavbar />
                <Container>
                    {title}
                    <Form onSubmit={this.handleSubmit}>
                        <FormGroup>
                            <Label for="username">Username</Label>
                            <Input type="text" name="username" id="username" value={item.username || ''}
                                   onChange={this.handleChange} autoComplete="username"/>
                        </FormGroup>
                        <FormGroup>
                            <Label for="firstName">First Name</Label>
                            <Input type="text" name="firstName" id="firstName" value={item.firstName || ''}
                                   onChange={this.handleChange} autoComplete="firstName"/>
                        </FormGroup>
                        <FormGroup>
                            <Label for="lastName">Last Name</Label>
                            <Input type="text" name="lastName" id="lastName" value={item.lastName || ''}
                                   onChange={this.handleChange} autoComplete="lastName"/>
                        </FormGroup>
                        <FormGroup>
                            <Button color="primary" type="submit">Save</Button>{' '}
                            <Button color="secondary" href="/users">Cancel</Button>
                        </FormGroup>
                    </Form>
                </Container>
            </div>
        );
    }
}

// Single-file functional wrapper
export default function UserEditWithRouter(props) {
    const navigate = useNavigate();
    const params = useParams();
    return <UserEdit {...props} navigate={navigate} params={params} />;
}
