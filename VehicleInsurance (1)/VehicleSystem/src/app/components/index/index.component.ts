import { Component } from '@angular/core';

@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent {
  showAddVehicle: boolean = false;
  showListVehicle: boolean = false;
  showUpdateInsurance: boolean = false;
  showAddInsurance: boolean = false;
  showListInsurance: boolean = false;
  showUpdateVehicle: boolean = false;
  showAddUser: boolean = false;
  showListUser: boolean = false;
  showUpdateUser: boolean = false;

  toggleDropdown(): void {
    this.showAddVehicle = !this.showAddVehicle;
    this.showListVehicle = !this.showListVehicle;
    this.showUpdateVehicle = !this.showUpdateVehicle;
  }
  toggleDropdown1(): void {
    this.showAddInsurance = !this.showAddInsurance;
    this.showListInsurance = !this.showListInsurance;
    this.showUpdateInsurance = !this.showUpdateInsurance;
  }
  toggleDropdown2(): void {
    this.showAddUser = !this.showAddUser;
    this.showListUser = !this.showListUser;
    this.showUpdateUser = !this.showUpdateUser;
  }

}
// index.component.ts

