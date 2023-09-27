import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
@Injectable({
  providedIn: 'root'
})
export class HttpService {
  

  baseUrl:string=environment.baseUrl;

  constructor(private http:HttpClient) { }

  login(obj:any){
    return (this.http.post(`${this.baseUrl}login`,obj,{ responseType: 'text' }));
  }

  invoice(obj:any){
    return (this.http.post(`${this.baseUrl}invoice`,obj,{ responseType: 'text' }));
  }

  getAllRecord(){
    return (this.http.get(`${this.baseUrl}alllogin`));
  }

  getAllinvoice(){
    return (this.http.get(`${this.baseUrl}allinvoice`));
  }

  makePayment(obj:any){
    return(this.http.post(`${this.baseUrl}paymentmethod`,obj,{ responseType: 'text' }));
  }
  getAllpayment(obj:any){
    return (this.http.post(`${this.baseUrl}payment`,obj,{ responseType: 'text' }))
  }
  transaction(obj:any){
    return (this.http.post(`${this.baseUrl}transaction`,obj,{ responseType: 'text' }));
  }
  getAllreceipts(obj:any){
    return (this.http.get(`${this.baseUrl}alltransaction`,obj))
  }
}