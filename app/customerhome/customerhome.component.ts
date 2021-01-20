import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, NavigationExtras, Router } from '@angular/router';
import { PersonService } from '../person.service';

@Component({
  selector: 'app-customerhome',
  templateUrl: './customerhome.component.html',
  styleUrls: ['./customerhome.component.css']
})
export class CustomerhomeComponent implements OnInit {
customer:any
customerData:any
customername:any
customeremail:any
@Input() cust: any;

  constructor(public router: Router, public personService: PersonService, private route: ActivatedRoute){
    this.route.queryParams.subscribe(params => {
        this.customername= params["customername"];
        this.customeremail= params["customeremail"];

      
    });}
  
  ngOnInit(): void {
  }

  async viewProfile(){
    await this.personService.customerProfile(this.customeremail).toPromise().then((data: any)=> {this.customer =data; console.log(data)});
    let navigationExtras: NavigationExtras = {
      queryParams: {
          "customername": this.customer.customerName,
          "customeremail": this.customer.customerEmailId,
          "customerlicensenumber": this.customer.customerLicenseNumber,
          "customerphonenumber": this.customer.customerPhoneNumber,
          "state": this.customer.state,
          "city": this.customer.city,
          "postal": this.customer.postal
         
      }
  };
    this.router.navigate(['/profile'], navigationExtras);
  }


}
