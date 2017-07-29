import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
    selector: 'app-negotiation',
    templateUrl: './negotiation.component.html',
    styleUrls: ['./negotiation.component.scss']
})
export class NegotiationComponent implements OnInit {
    
    constructor(public router: Router){
    	console.log('hello');
    }

    ngOnInit() { 
        console.log(this);
    }

    tst(){
        this.router.navigate(['/dashboard/documents']);
    }
}
