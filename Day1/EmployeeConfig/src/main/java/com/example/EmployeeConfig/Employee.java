package com.example.EmployeeConfig;

import com.example.EmployeeConfig.EmployeeConfiguration;
import org.springframework.stereotype.Component;

@Component 
public class Employee {

    private final EmployeeConfiguration employeeConfiguration;

    public Employee(EmployeeConfiguration employeeConfiguration){
        this.employeeConfiguration = employeeConfiguration;
    }

    public void display(){
        System.out.println("Employee Name: "+ employeeConfiguration.getName());
        System.out.println("Department: " + employeeConfiguration.getDepartment());
        System.out.println("Salary: "+ employeeConfiguration.getSalary());
    }
}
