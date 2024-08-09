package com.example.SpringBootDataJPA.controllers;

import com.example.SpringBootDataJPA.entities.EmployeeEntity;
import com.example.SpringBootDataJPA.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private  final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @GetMapping("/{employeeId}")
    public EmployeeEntity getEmployeeById(@RequestBody long employeeId){
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping()
    public EmployeeEntity createNewEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.createNewEmployee(employeeEntity);
    }

}
