import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { routerTransition } from '../router.animations';
import { Http, Response, Headers, RequestOptions } from '@angular/http';
import {
    FormGroup,
    FormControl,
    Validators,
     FormBuilder
 } from '@angular/forms';
import {log} from "util";

@Component({
    selector: 'app-login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.scss'],
    animations: [routerTransition()]
})
export class LoginComponent implements OnInit {

    myform: FormGroup;
    name: FormControl;
    password: FormControl;
    showErrorMessage = false;

    constructor(public router: Router, private http: Http) { }

    ngOnInit() {
    this.createFormControls();
     this.createForm();
    }

    createFormControls() {
      this.name = new FormControl('', [
        Validators.required
        // ,Validators.pattern("[^ @]*@[^ @]*")
    ]);
      this.password = new FormControl('', [
        Validators.required,
        Validators.minLength(4)
      ]);
    }

    createForm() {
        this.myform = new FormGroup({
          name: this.name,
          password: this.password
        });
     }

    onLoggedin() {
      console.log(this.name.value);
      if(this.name.value == 'admin' && this.password.value == 'admin'){
        localStorage.setItem('isLoggedin', 'true');
      }else{
        alert('Usuário ou senha inválido');
      }
    }

}
