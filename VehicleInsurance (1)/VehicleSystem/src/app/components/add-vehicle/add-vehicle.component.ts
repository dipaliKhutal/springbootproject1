
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Vehicle } from 'src/app/vehicle';
import { VehicleServiceService } from 'src/app/vehicle-service.service';

@Component({
  selector: 'app-add-vehicle',
  templateUrl: './add-vehicle.component.html',
  styleUrls: ['./add-vehicle.component.css']
})
export class AddVehicleComponent implements OnInit{
  vehicle: Vehicle=new Vehicle();
  constructor(private vehicleServiceService:VehicleServiceService,private router:Router)
  {}
ngOnInit(): void{

}
createVehicle()
{
  this.vehicleServiceService['createVehicle'](this.vehicle).subscribe((data:any) =>
    {
  console.log(data);
  this.goToVehicleList();
    },
    (error: any)=>console.log(error));
}
goToVehicleList()
  {
    this.router.navigate(['/list-vehicle']);
  }
  onSubmit()
  {
    console.log(this.vehicle);
    this.createVehicle();
    alert("Vehicle Updated Successfully..!");
      setTimeout(() => {
        this.router.navigate(['/list-vehicle']);
      }, 100);

  }
}