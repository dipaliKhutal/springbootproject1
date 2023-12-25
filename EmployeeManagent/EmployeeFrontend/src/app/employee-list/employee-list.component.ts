import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  employees: Employee[] = [];
  filteredEmployees: Employee[] = [];
  searchTerm: string = '';

  constructor(private employeeService: EmployeeService, private router: Router) {}

  ngOnInit(): void {
    this.getEmployees();
  }

  private getEmployees() {
    this.employeeService.getEmployeesList().subscribe(data => {
      this.employees = data || []; // Ensure data is not undefined
      this.filteredEmployees = [...this.employees]; // Initially, show all employees
    });
  }

  employeeDetails(id: number) {
    this.router.navigate(['employee-details', id]);
  }

  updateEmployee(id: number) {
    this.router.navigate(['update-employee', id]);
  }

  deleteEmployee(id: number) {
    this.employeeService.deleteEmployee(id).subscribe(data => {
      console.log(data);
      this.getEmployees(); // Refresh the employee list after deletion
    });
  }

  searchEmployees() {
    if (this.employees) {
      this.filteredEmployees = this.employees.filter(employee =>
        (employee.firstName && employee.firstName.toLowerCase().includes(this.searchTerm.toLowerCase())) ||
        (employee.lastName && employee.lastName.toLowerCase().includes(this.searchTerm.toLowerCase()))
        // You can include other fields as well for search
      );
    }
  }
}
