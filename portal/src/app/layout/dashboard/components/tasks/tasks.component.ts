import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'app-tasks',
    templateUrl: './tasks.component.html',
    styleUrls: ['./tasks.component.scss']
})
export class TasksComponent implements OnInit {
    
    public showInfo = false;
    public info = { name: '', status: ''};

    constructor() { 
    	console.log('hello');
    }

    ngOnInit() { 
    }

    moreInfo(status, name) {
    	this.info = {
    		status : status,
    		name : name 
    	};
    	this.showInfo = true;
    }

    closeInfo() {
    	this.showInfo = false;
    }
}
