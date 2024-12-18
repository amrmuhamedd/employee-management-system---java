package com.employ.crud_employ_api.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/")
    public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {
        return  employeeService.newEmployee(employee);
    }

    @GetMapping("/")
    public List<Employee> getEmployee(){
        return this.employeeService.getEmployee();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateEmployeeById(@PathVariable Integer id, @RequestBody Employee updatedEmployee){
        return  this.employeeService.updateEmployee(id, updatedEmployee);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getEmployeeById(@PathVariable Integer id){
        return  this.employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteEmployeeById(@PathVariable Integer id){
        return  this.employeeService.deleteEmployee(id);
    }
}
