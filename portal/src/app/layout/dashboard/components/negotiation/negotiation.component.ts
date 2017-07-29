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

    chat(){
        this.router.navigate(['/dashboard/chat']);
    }

    tasks(){
        this.router.navigate(['/dashboard/tasks']);
    }

    documents(){
        this.router.navigate(['/dashboard/documents']);
    }

    help(){
        this.router.navigate(['/dashboard/help']);
    }
}
