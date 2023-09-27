import { Component, OnInit,TemplateRef } from '@angular/core';
import { HttpService } from '../http.service';
import { BsModalService,BsModalRef  } from 'ngx-bootstrap/modal';
import { Invoice } from '../model/invoice';
import { ToastrService  } from 'ngx-toastr';
import {Router} from '@angular/router';
@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  billData:any[]=[];
  isSelect:boolean=false;
  modalRef!: BsModalRef; 
  billobj=<Invoice>{};
  p:number=1;
  nameSearch:string='';

  config = {
    animated: true,
    
    ignoreBackdropClick: true,
    class: "alert alert-danger"
  };
  constructor(private service:HttpService,
    private router:Router,
    private modalservice:BsModalService,
    private toaster:ToastrService) { }

  ngOnInit(): void {
    this.GetAllInvoice();
  }
  GetAllInvoice(){
    this.service.getAllinvoice()
    .subscribe((response:any)=>{
      console.log(response);
      
        this.billData=response;
      
      
    })
  }

  onPayment(item:any){
    // console.log(item);
    this.isSelect=true;
    this.billobj=item;
  }

  isRadioCheck(){
    if (this.isSelect) {
      return true;
    }else{
      return false;
    }    
  }

  onPay(){
    // if(!this.isRadioCheck()){
    //   this.toaster.info("Please Select a Record to proceed payment")
    // }
    // else{
              this.router.navigate(['/payment'])
    //}
    
  }

}