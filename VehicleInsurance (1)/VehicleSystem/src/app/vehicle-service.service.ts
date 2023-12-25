
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Vehicle } from './vehicle'

@Injectable({
  providedIn: 'root',
})
export class VehicleServiceService {
  private baseURL="http://localhost:8080/vechicle";
  constructor( private httpClient:HttpClient) { }

  getVehicleList():Observable<Vehicle[]>
  {
    return this.httpClient.get<Vehicle[]>(`${this.baseURL}`);
  }
  createVehicle(vehicle:Vehicle):Observable<Object>
  {
    return this.httpClient.post(`${this.baseURL}`,vehicle);
  }
  getVehicleById(id:number):Observable<Vehicle>
  {
    return this.httpClient.get<Vehicle>(`${this.baseURL}/${id}`);
  }
  updateVehicle(id:number,vehicle:Vehicle):Observable<Object>
  {
    return this.httpClient.put(`${this.baseURL}/${id}`,vehicle);
  }
  deleteVehicle(id:number):Observable<Object>
  {
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }
}
