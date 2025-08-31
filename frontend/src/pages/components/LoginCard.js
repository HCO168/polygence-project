

import React from 'react';
import {
    Button,
    Card,
    CardBody,
    CardSubtitle,
    CardText,
    CardTitle,
} from 'reactstrap';

export default function LoginCard() {
    return (
        <Card style={{width: '18rem'}}>
            <CardBody>
                <CardTitle tag="h5">
                    Let's start!
                </CardTitle>
                <CardSubtitle
                    className="mb-2 text-muted"
                    tag="h6"
                >
                    sign in or log in to start using!
                </CardSubtitle>
                <CardText>
                    Let begin using the powerful vocabulary learning website!
                </CardText>
                <div  className="d-flex gap-2 justify-content-center">
                    <Button>
                        Log In
                    </Button>
                    <Button>
                        Sign up
                    </Button>
                </div>
            </CardBody>
        </Card>
    );
}
