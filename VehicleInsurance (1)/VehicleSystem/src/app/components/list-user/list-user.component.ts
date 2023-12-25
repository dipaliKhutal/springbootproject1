import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/user';
import { UserServiceService } from 'src/app/user-service.service';

@Component({
  selector: 'app-list-user',
  templateUrl: './list-user.component.html',
  styleUrls: ['./list-user.component.css']
})
export class ListUserComponent implements OnInit{
  
  
    user!:User[];
  
    constructor(private userServiceService: UserServiceService, private router: Router) {}
  
    ngOnInit(): void {
      this.getAllUsers();
    }
  
    private getAllUsers() {
      this.userServiceService. getUserList().subscribe(data => {
        this.user= data;
      });
    }
  
  
    updateUser(id: number) {
      this.router.navigate(['adminpage/User/updateUser', id]);  
    }
  
    deleteUser(id: number) {
      this.userServiceService.deleteUser(id).subscribe(data => {
        console.log(data);
        this.getAllUsers();
      });
      alert("User Details Deleted");
    }
  }
  