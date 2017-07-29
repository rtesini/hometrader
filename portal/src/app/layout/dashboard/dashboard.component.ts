import { Component, OnInit } from '@angular/core';
import { routerTransition } from '../../router.animations';

@Component({
    selector: 'app-dashboard',
    templateUrl: './dashboard.component.html',
    styleUrls: ['./dashboard.component.scss'],
    animations: [routerTransition()]
})
export class DashboardComponent implements OnInit {
    public template: string;


    constructor() {
    }

    ngOnInit() {
    }

    tst() {
        alert('1111');
        console.log(this.template);
    }
}
