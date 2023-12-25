import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './user'; // Import the User interface 

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  private apiUrl = 'http://localhost:8080/user'; // Adjust the URL to match your backend API

  constructor(private http: HttpClient) { }

  getAllUsers(): Observable<User>{
    return this.http.get<User>(`${this.apiUrl}`);
  }
  getUserList():Observable<User[]>
  {
    return this.http.get<User[]>(`${this.apiUrl}`);
  }

  getUserById(id: number): Observable<User> {
    return this.http.get<User>(`${this.apiUrl}/${id}`);
  }

  addUser(user: User): Observable<User> {
    return this.http.post<User>(`${this.apiUrl}`, user);
  }

  updateUser(id: number, user: User): Observable<User> {
    return this.http.put<User>(`${this.apiUrl}/${id}`, user);
  }

  deleteUser(id: number): Observable<any> {
    return this.http.delete(`${this.apiUrl}/${id}`);
  }

  // Add other methods as needed based on your backend API
}
