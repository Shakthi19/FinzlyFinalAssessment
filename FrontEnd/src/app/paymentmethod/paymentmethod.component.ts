import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-paymentmethod',
  templateUrl: './paymentmethod.component.html',
  styleUrls: ['./paymentmethod.component.css']
})
export class PaymentmethodComponent implements OnInit {
   otp = this.generateOTP();
selectedWalletService:any;
selectedPaymentMethod:any; 


   constructor(private service:HttpService,private router:Router) { }

  ngOnInit(): void {
    
  }

  generateOTP(): string {
    const characters = '0123456789'; 
    let otp = '';
  
    for (let i = 0; i < 6; i++) {
      const randomIndex = Math.floor(Math.random() * characters.length);
      otp += characters.charAt(randomIndex);
    }
  
    return otp;
  }
  makePayment(argument: any) {
   
   const dataToStore = JSON.stringify(this.selectedPaymentMethod);
   sessionStorage.setItem('paymentMethod', dataToStore);
   this.router.navigate(['/payment']);
 }
 }