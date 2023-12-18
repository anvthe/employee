package com.avalanche.employee.controller;

import com.avalanche.employee.model.Employee;
import com.avalanche.employee.model.EmployeeDto;
import com.avalanche.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.avalanche.employee.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    // ... other methods
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/save")
    public HttpStatus save (@RequestBody EmployeeDto employee){
        employeeService.save(employee);
        return HttpStatus.OK;
    }

    @GetMapping("/get-employee/{id}")
    public EmployeeDto getEmployee(@PathVariable Long id){
        return employeeService.getEmployee(id);
    }

    @PutMapping("/update-employee/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody EmployeeDto employeeDto){

         return  employeeService.updateEmployee(id, employeeDto);
    }




}
