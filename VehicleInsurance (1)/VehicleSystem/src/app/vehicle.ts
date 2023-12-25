// vehicle.ts

export class Vehicle {
    id!: number;
    category!: string;
    plateNumber!:string;
    manufacturer!: string;
    type!: string;
    registrationDate!: string;
    premiumAmount!: number;
    nextPreDate!: string;
    previousPreDate!:string;
    pendingFines!: number;
  }
  
  // If you have more details in your model that are optional or can be null, you can modify the interface accordingly.
  
