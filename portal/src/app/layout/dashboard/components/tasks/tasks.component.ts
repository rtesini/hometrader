import { Component, OnInit } from '@angular/core';
import { TaskService } from '../../../../shared/index';

@Component({
    selector: 'app-tasks',
    templateUrl: './tasks.component.html',
    styleUrls: ['./tasks.component.scss'],
    providers: [TaskService]
})
export class TasksComponent implements OnInit {
    
    public showInfo = false;
    public info = { name: '', status: ''};
    public tasks = [];

    constructor(private taskService: TaskService) { 
    	console.log('hello');
    	this.loadTasks();
    }

    ngOnInit() { 
    }

    loadTasks() {
    	this.taskService.getTasks().subscribe(data => this.tasks = data);
    	console.log(this.tasks);
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
