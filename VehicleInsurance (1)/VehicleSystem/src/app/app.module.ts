import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AddInsuranceComponent } from './components/add-insurance/add-insurance.component';
import { AddUserAccountComponent } from './components/add-user-account/add-user-account.component';
import { AddVehicleComponent } from './components/add-vehicle/add-vehicle.component';
import { FragmentsComponent } from './components/fragments/fragments.component';
import { IndexComponent } from './components/index/index.component';
import { ListInsuranceComponent } from './components/list-insurance/list-insurance.component';
import { ListUserComponent } from './components/list-user/list-user.component';
import { ListVehicleComponent } from './components/list-vehicle/list-vehicle.component';
import { LoginComponent } from './components/login/login.component';
import { UpdateInsuranceComponent } from './components/update-insurance/update-insurance.component';
import { UpdateUserComponent } from './components/update-user/update-user.component';
import { UpdateVehicleComponent } from './components/update-vehicle/update-vehicle.component';
import { UserAccountComponent } from './components/user-account/user-account.component';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import {  HttpClientModule } from '@angular/common/http';
import { AboutusComponent } from './aboutus/aboutus.component';
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    AddInsuranceComponent,
    AddUserAccountComponent,
    AddVehicleComponent,
    FragmentsComponent,
    IndexComponent,
    ListInsuranceComponent,
    ListUserComponent,
    ListVehicleComponent,
    UpdateInsuranceComponent,
    UpdateUserComponent,
    UpdateVehicleComponent,
    UserAccountComponent,
    AboutusComponent
  ],
  imports: [
    RouterModule.forRoot([]),
    BrowserModule,
    AppRoutingModule,
    FontAwesomeModule,
    FontAwesomeModule,
    FormsModule,
    ReactiveFormsModule,
    NgbModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
// app.module.ts