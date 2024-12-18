package com.employ.crud_employ_api.employees;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
}
