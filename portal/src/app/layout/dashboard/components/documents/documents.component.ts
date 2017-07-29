import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'app-documents',
    templateUrl: './documents.component.html',
    styleUrls: ['./documents.component.scss']
})
export class DocumentsComponent implements OnInit {
    
    public edited = false;
    public filename = '';
    public files=[{name:'fotos.zip',vence:false, vencimento:''},
    {name:'RG.pdf',vence:true, vencimento:'22/05/2018'},
    {name:'cpf.pdf',vence:true, vencimento:'22/05/2018'}];
    public selectedFile = {name:'',vence:false, vencimento:''};

    constructor() { 
        console.log('hello');
        console.log(this.files);
    }

    ngOnInit() { 
    }

    details(filename){
        console.log(filename);
        this.edited = true;
        this.filename = filename;
        for (let file of this.files) {
            if(filename == file.name){
                this.selectedFile = file;
            }
        }
    }

    close(){
        this.edited = false;
    }
}
