import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  customerId:string|null='';
  constructor(private router:Router) { }

  ngOnInit(): void {
    this.customerId=sessionStorage.getItem("customerId");
  }

  onLogout(){
    sessionStorage.removeItem("customerId");
    sessionStorage.clear();
    this.router.navigate(['/login']);
}


}
