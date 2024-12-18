package com.employ.crud_employ_api.employees;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private  final EmplyeeRepository emplyeeRepository;

    @Autowired
    public EmployeeService(EmplyeeRepository emplyeeRepository) {
        this.emplyeeRepository = emplyeeRepository;
    }

    public ResponseEntity<Object> newEmployee(Employee employee){
        emplyeeRepository.save(employee);
        return new ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    public List<Employee> getEmployee(){
        return this.emplyeeRepository.findAll();
    }

    public ResponseEntity<Object> updateEmployee(Integer id, Employee updatedEmployee){
        Optional<Employee> employeeOptional = emplyeeRepository.findById(id);
        if(employeeOptional.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        
        Employee existingEmpolyee = employeeOptional.get();
        existingEmpolyee.setEmail(updatedEmployee.getEmail());
        existingEmpolyee.setName(updatedEmployee.getName());
        existingEmpolyee.setPosition(updatedEmployee.getPosition());
        existingEmpolyee.setSalary(updatedEmployee.getSalary());

        emplyeeRepository.save(existingEmpolyee);
        return  ResponseEntity.ok(existingEmpolyee);
    }
}
