
// insurance-service.service.ts

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Insurance } from './insurance'
// Import your Insurance model

@Injectable({
  providedIn: 'root',
})
export class InsuranceServiceService {
  private baseURL="http://localhost:8080/insurance";
  constructor( private httpClient:HttpClient) { }

  getInsuranceList():Observable<Insurance[]>
  {
    return this.httpClient.get<Insurance[]>(`${this.baseURL}`);
  }
  createInsurance(insurance:Insurance):Observable<Object>
  {
    return this.httpClient.post(`${this.baseURL}`,insurance);
  }
  getInsuranceById(id:number):Observable<Insurance>
  {
    return this.httpClient.get<Insurance>(`${this.baseURL}/${id}`);
  }
  updateInsurance(id:number,insurance:Insurance):Observable<Object>
  {
    return this.httpClient.put(`${this.baseURL}/${id}`,insurance);
  }
  deleteInsurance(id:number):Observable<Object>
  {
    return this.httpClient.delete(`${this.baseURL}/${id}`);
  }
}
