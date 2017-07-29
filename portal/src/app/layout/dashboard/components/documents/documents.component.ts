import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'app-documents',
    templateUrl: './documents.component.html',
    styleUrls: ['./documents.component.scss']
})
export class DocumentsComponent implements OnInit {
    
    public edited = false;
    public filename = '';


    constructor() { 
    	console.log('hello');
    }

    ngOnInit() { 
    }

    details(filename){
        console.log(filename);
        this.edited = true;
        this.filename = filename;
    }

    close(){
        this.edited = false;
    }
}
