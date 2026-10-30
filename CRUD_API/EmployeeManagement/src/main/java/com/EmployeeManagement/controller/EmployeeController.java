package com.EmployeeManagement.controller;

import java.lang.foreign.Linker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManagement.entity.Employee;
import com.EmployeeManagement.service.EmployeeService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping ("/api/employees")
public class EmployeeController {

    private final EmployeeService employeeService;
    

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        Employee savedEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedEmployee);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        List<Employee> getEmployee = employeeService.getAllEmployee();
        if(getEmployee.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        return ResponseEntity.status(HttpStatus.OK).body(getEmployee);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable Long id){
            Optional<Employee> employee = employeeService.getById(id);
            if(employee.isEmpty()){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }

            return  ResponseEntity.status(HttpStatus.OK).body(employee);
    }

    @PutMapping ("/{id}")
    public ResponseEntity<String> updatedEmployee(@PathVariable Long id, @RequestBody Employee employee){
            Employee updatedEmployee = employeeService.updatedEmployee(id, employee);
            if(updatedEmployee == null){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("The employee with id: "+ id +" Not found");
            }
            
            return ResponseEntity.status(HttpStatus.OK).body("Employee with id: "+ id + " updated successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id){
        boolean deletedUser = employeeService.deleteEmployee(id);

        if(deletedUser == false){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("The employee with id: "+ id +" does not exists");
        }

        return ResponseEntity.status(HttpStatus.OK).body("Employee with id: "+ id+ " deleted Successfully");
    }
   
    
    

}
