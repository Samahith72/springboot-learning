package com.example.EmployeeConfig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component 
@ConfigurationProperties(prefix = "employee")
public class EmployeeConfiguration {
    private String name;
    private String department;
    private int salary;
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    
    

}
