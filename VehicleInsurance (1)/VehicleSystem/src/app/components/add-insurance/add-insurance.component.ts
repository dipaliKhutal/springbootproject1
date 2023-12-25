import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Insurance } from 'src/app/insurance';
import { InsuranceServiceService } from 'src/app/insurance-service.service';

@Component({
  selector: 'app-add-insurance',
  templateUrl: './add-insurance.component.html',
  styleUrls: ['./add-insurance.component.css']
})
export class AddInsuranceComponent implements OnInit {
  insurance: Insurance=new Insurance();

  constructor(private insuranceServiceService:InsuranceServiceService,private router:Router)
  {}
  ngOnInit(): void {
    
  }
  createInsurance()
  {
    this.insuranceServiceService['createInsurance'](this.insurance).subscribe((data:any) =>
    {
  console.log(data);
  this.goToInsuranceList();
    },
    (error: any)=>console.log(error));
  }
  goToInsuranceList()
  {
    this.router.navigate(['/list-insurance']);
  }
  onSubmit()
  {
    console.log(this.insurance);
    this.createInsurance();
    alert("Insurance Updated Successfully..!");
      setTimeout(() => {
        this.router.navigate(['/list-insurance']);
      }, 100);

  }
  }
