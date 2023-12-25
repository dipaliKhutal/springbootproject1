import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Insurance } from 'src/app/insurance';
import { InsuranceServiceService } from 'src/app/insurance-service.service';

@Component({
  selector: 'app-list-insurance',
  templateUrl: './list-insurance.component.html',
  styleUrls: ['./list-insurance.component.css']
})
export class ListInsuranceComponent implements OnInit {

  
  insurance!:Insurance[];

  constructor(private insuranceServiceService: InsuranceServiceService, private router: Router) {}

  ngOnInit(): void {
    this.getInsurance();
  }

  private getInsurance() {
    this.insuranceServiceService.getInsuranceList().subscribe(data => {
      this.insurance = data;
    });
  }


  updateInsurance(id: number) {
    this.router.navigate(['adminpage/Insurance/updateInsurance', id]);  
  }

  deleteInsurance(id: number) {
    this.insuranceServiceService.deleteInsurance(id).subscribe(data => {
      console.log(data);
      this.getInsurance();
    });
    alert("Insurance Details Deleted");
  }
}