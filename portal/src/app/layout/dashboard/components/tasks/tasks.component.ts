import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'app-documents',
    templateUrl: './tasks.component.html',
    styleUrls: ['./tasks.component.scss']
})
export class TasksComponent implements OnInit {
    
    constructor() { 
    	console.log('hello');
    }

    ngOnInit() { 
    }
}
