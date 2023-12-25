import { Component } from '@angular/core';

@Component({
  selector: 'app-user-account',
  templateUrl: './user-account.component.html',
  styleUrls: ['./user-account.component.css']
})
export class UserAccountComponent {
  getDummyVehicles() {
    return [
      {
        plateNumber: 'ABC123',
        category: 'Sedan',
        registrationDate: '2023-01-01',
        nextPreDate: '2023-02-01',
        previousPreDate: '2022-12-01',
        premiumAmount: 1000,
      },
      // Add more dummy data as needed
    ];
  }

}
// vehicle.service.ts
