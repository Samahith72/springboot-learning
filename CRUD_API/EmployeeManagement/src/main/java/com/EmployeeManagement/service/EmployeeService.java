package com.EmployeeManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.EmployeeManagement.entity.Employee;
import com.EmployeeManagement.repository.EmployeeRepository;

@Service 
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    public Employee createEmployee(Employee employeeReq){
        return employeeRepository.save(employeeReq);
    }

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> getById(Long id){
        return employeeRepository.findById(id);
    }

    public Employee updatedEmployee(Long id, Employee employee){
        Optional<Employee> emp = employeeRepository.findById(id);
        if(emp.isEmpty()){
            return null;
        }

        Employee existEmployee = emp.get();
        existEmployee.setDepartment(employee.getDepartment());
        existEmployee.setEmail(employee.getEmail());
        existEmployee.setJoiningDate(employee.getJoiningDate());
        existEmployee.setName(employee.getName());
        existEmployee.setSalary(employee.getSalary());

        return employeeRepository.save(existEmployee);
    }

    public boolean deleteEmployee(Long id){
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isEmpty()){
            return false;
        }

        employeeRepository.delete(employee.get());
        return true;
    }
}
