import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';
import { Router } from '@angular/router';
import {Payment} from'../model/payment';
@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent implements OnInit {
  obj:any;
  payData:any[]=[];
  payobj=<Payment>{};
  constructor(private service:HttpService,private router:Router) { }

  ngOnInit(): void {
    
  }

  GetAllPayment(){
    this.service.getAllpayment(this.obj)
    .subscribe((response:any)=>{
      console.log(response);
      
        this.payData=response;
      
      
    })
  }

  onClick(item:any){
    
    this.payobj=item;
  }
  savePayment(argument: any) {
   
    const dataToStore = JSON.stringify(this);
    sessionStorage.setItem('customerId', dataToStore);
    this.router.navigate(['/transaction']);
  }

}
