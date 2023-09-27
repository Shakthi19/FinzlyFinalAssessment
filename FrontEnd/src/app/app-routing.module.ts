import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { PaymentComponent } from './payment/payment.component';
import { NotfoundComponent } from './notfound/notfound.component';
import { PaymentmethodComponent } from './paymentmethod/paymentmethod.component';
import { TransactionComponent } from './transaction/transaction.component';

const routes: Routes = [
  {
    path:"",redirectTo:"/login",pathMatch:"full"
  },
  {
    path:"login",component:LoginComponent
  },
  {
    path:"invoice",component:HomeComponent
  },
  {
    path:"payment",component:PaymentComponent
  },
  {
    path:"paymentmethod",component:PaymentmethodComponent
  },
  {
      path:"transaction",component:TransactionComponent
  },  
  {
    path:"**",component:NotfoundComponent
  }
];
;

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
