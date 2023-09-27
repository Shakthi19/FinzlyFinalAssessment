import { Component,OnDestroy, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { HttpService } from '../http.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit,OnDestroy {
  isShow:boolean=true;

  incorrect:string='';
  constructor(private service:HttpService,
              private router:Router) { }

  ngOnInit(): void {
    document.body.className='bg_background';
  }

  onShow(){
    this.isShow=!this.isShow;
  }
  
  onSubmit(f:NgForm){

    let obj={
      customerId:f.value.customerId,
      otp:f.value.otp
    }

    this.service.login(obj)
    .subscribe((response:any)=>{
      console.log(response);
     
     if(response.message==="Login Successful!!!"){
        //navigate to dashboard
        sessionStorage.setItem("customerId",response.customerId);
        this.router.navigate(['/invoice']);
      }else{
        this.incorrect=response.message;
      }

    })

  }

  ngOnDestroy(): void {
    document.body.className='';
  }

}
