import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/user';
import { UserServiceService } from 'src/app/user-service.service';

@Component({
  selector: 'app-add-user-account',
  templateUrl: './add-user-account.component.html',
  styleUrls: ['./add-user-account.component.css']
})
export class AddUserAccountComponent implements OnInit {
    user:User=new User();
  
    constructor(private UserServiceService:UserServiceService,private router:Router)
    {}
    ngOnInit(): void {
      
    }
    AddUser()
    {
      this.UserServiceService['addUser'](this.user).subscribe((data:any) =>
      {
    console.log(data);
    this.goToUserList();
      },
      (error: any)=>console.log(error));
    }
    goToUserList()
    {
      this.router.navigate(['/list-user']);
    }
    onSubmit()
    {
      console.log(this.user);
      this.AddUser();
      alert("User Updated Successfully..!");
        setTimeout(() => {
          this.router.navigate(['/list-user']);
        }, 100);
  
    }
    }
