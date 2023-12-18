package com.avalanche.employee.controller;

import com.avalanche.employee.model.Employee;
import com.avalanche.employee.model.EmployeeDto;
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


    @PostMapping("/save")
    public HttpStatus save (@RequestBody EmployeeDto employee){
        employeeService.save(employee);
        return HttpStatus.OK;
    }

    @GetMapping("/get-employee/{id}")
    public EmployeeDto getEmployee(@PathVariable Long id){
        return employeeService.getEmployee(id);
    }


@PutMapping("/update/{id}")
    public Employee update (@PathVariable Long id, @RequestBody EmployeeDto employeeDto){
        return employeeService.updateEmployee(employeeDto, id);

}


}
