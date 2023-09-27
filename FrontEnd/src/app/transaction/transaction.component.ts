import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';
import { Router } from '@angular/router';
import { Transaction } from '../model/transaction';

@Component({
  selector: 'app-transaction',
  templateUrl: './transaction.component.html',
  styleUrls: ['./transaction.component.css']
})
export class TransactionComponent implements OnInit {

  obj:any;
  transData:any[]=[];
  transobj=<Transaction>{};
  constructor(private service:HttpService,private router:Router) { }

  ngOnInit(): void {
  }

  GetAllPayment(){
    this.service.getAllreceipts(this.obj)
    .subscribe((response:any)=>{
      console.log(response);
      
        this.transData=response;
      
      
    })
  }

}
