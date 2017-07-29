import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'app-negotiation',
    templateUrl: './negotiation.component.html',
    styleUrls: ['./negotiation.component.scss']
})
export class NegotiationComponent implements OnInit {
    
    constructor() { 
    	console.log('hello');
    }

    ngOnInit() { 
    }
}
