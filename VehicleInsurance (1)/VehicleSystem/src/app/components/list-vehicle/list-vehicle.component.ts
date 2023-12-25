import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Vehicle } from 'src/app/vehicle';
import { VehicleServiceService } from 'src/app/vehicle-service.service';


@Component({
  selector: 'app-list-vehicle',
  templateUrl: './list-vehicle.component.html',
  styleUrls: ['./list-vehicle.component.css']
})
export class ListVehicleComponent {
  vehicle!:Vehicle[] ;

  constructor(private vehicleServiceService: VehicleServiceService, private router: Router) {}

  ngOnInit(): void {
    this.vehicle = [
      {
        id: 1,
        category: 'Sedan',
        plateNumber: 'ABC123',
        manufacturer: 'Toyota',
        type: 'Gasoline',
        registrationDate: '2022-01-01', // Use a Date type for actual dates
        premiumAmount: 500,
        nextPreDate: '2023-01-01', // Use a Date type for actual dates
        previousPreDate: '2021-01-01', // Use a Date type for actual dates
        pendingFines: 100,
      },
      {
        id: 2,
        category: 'SUV',
        plateNumber: 'XYZ789',
        manufacturer: 'Ford',
        type: 'Diesel',
        registrationDate: '2022-02-01', // Use a Date type for actual dates
        premiumAmount: 600,
        nextPreDate: '2023-02-01', // Use a Date type for actual dates
        previousPreDate: '2021-02-01', // Use a Date type for actual dates
        pendingFines: 50,
      },
      // Example 2
{
  id: 3,
  category: 'Compact',
  plateNumber: 'LMN456',
  manufacturer: 'Honda',
  type: 'Hybrid',
  registrationDate: '2022-03-01', // Use a Date type for actual dates
  premiumAmount: 550,
  nextPreDate: '2023-03-01', // Use a Date type for actual dates
  previousPreDate: '2021-03-01', // Use a Date type for actual dates
  pendingFines: 75,
},

// Example 3
{
  id: 4,
  category: 'Truck',
  plateNumber: 'PQR789',
  manufacturer: 'Chevrolet',
  type: 'Gasoline',
  registrationDate: '2022-04-01', // Use a Date type for actual dates
  premiumAmount: 700,
  nextPreDate: '2023-04-01', // Use a Date type for actual dates
  previousPreDate: '2021-04-01', // Use a Date type for actual dates
  pendingFines: 25,
}
]
    this.getVehicle();
  }

  private getVehicle() {
    this.vehicleServiceService.getVehicleList().subscribe(data => {
      this.vehicle = data;
    });
  }


  updateVehicle(id: number) {
    this.router.navigate(['adminpage/Vehicle/updateVehicle', id]);  
  }

  deleteVehicle(id: number) {
    this.vehicleServiceService.deleteVehicle(id).subscribe(data => {
      console.log(data);
      this.getVehicle();
    });
    alert("Vehicle Details Deleted");
  }
}


