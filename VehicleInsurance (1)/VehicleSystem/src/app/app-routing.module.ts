import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddInsuranceComponent } from './components/add-insurance/add-insurance.component';
import { AddUserAccountComponent } from './components/add-user-account/add-user-account.component';
import { AddVehicleComponent } from './components/add-vehicle/add-vehicle.component';
import { FragmentsComponent } from './components/fragments/fragments.component';
import { ListInsuranceComponent } from './components/list-insurance/list-insurance.component';
import { ListUserComponent } from './components/list-user/list-user.component';
import { ListVehicleComponent } from './components/list-vehicle/list-vehicle.component';
import { LoginComponent } from './components/login/login.component';
import { UpdateInsuranceComponent } from './components/update-insurance/update-insurance.component';
import { UpdateUserComponent } from './components/update-user/update-user.component';
import { UpdateVehicleComponent } from './components/update-vehicle/update-vehicle.component';
import { UserAccountComponent } from './components/user-account/user-account.component';

import { IndexComponent } from './components/index/index.component';
import { RegistrationComponent } from './registration/registration.component';
import { AboutusComponent } from './aboutus/aboutus.component';


const routes: Routes = [
{path:'add-insurance',component:AddInsuranceComponent},
{path:'add-user-account',component:AddUserAccountComponent},
  {path:'add-vehicle',component:AddVehicleComponent},
  {path:'Aboutus',component:AboutusComponent},
  {path:'fragments',component:FragmentsComponent},
  {path:'list-insurance',component:ListInsuranceComponent},
  {path:'list-insurance/add-insurance',component:AddInsuranceComponent},
  {path:'list-user',component:ListUserComponent},
  {path:'list-vehicle',component:ListVehicleComponent},
  {path:'login',component:LoginComponent},
  {path: 'fragments/Sign Up',component:RegistrationComponent},
  {path:'index',component:IndexComponent},
  {path:'fragments/user/userAccount',component:AddUserAccountComponent},
  {path:'registration',component:RegistrationComponent},
  {path:'update-insurance',component:UpdateInsuranceComponent},
  {path:'update-user',component:UpdateUserComponent},
  {path:'update-vehicle',component:UpdateVehicleComponent},
  {path:'user-account',component:UserAccountComponent},
  {path:'',redirectTo:'/index',pathMatch:'full'},
  {path:'Home',redirectTo:'/fragments',pathMatch:'full'},
  {path:'add-insurance',redirectTo:'/add-insurance',pathMatch:'full'},
  {path:'login',redirectTo:'/login',pathMatch:'full'}

  ];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
