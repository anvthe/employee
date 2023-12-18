package com.avalanche.employee.service;

import com.avalanche.employee.model.Employee;
import com.avalanche.employee.model.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.avalanche.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
private EmployeeRepository employeeRepository;

    public void save ( EmployeeDto employee) {
    Employee e = new Employee();
    e.setName(employee.getName());
    e.setSalary(employee.getSalary());
    e.setAge(employee.getAge());
    e.setGender(employee.getGender());
    e.setDept(employee.getDept());
    employeeRepository.save(e);
   }

    //get employee by id
    public EmployeeDto getEmployee (Long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow();
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setName(employee.getName());
        employeeDto.setAge(employee.getAge());
        return employeeDto;
    }

    //update by id
    public Employee updateEmployee (EmployeeDto employeeDto, Long id){

        Employee exitOldEmployee = employeeRepository.findById(id).orElseThrow();

//       exitOldEmployee.setName(employeeDto.getName());
//        exitOldEmployee.setGender(employeeDto.getGender());
//        exitOldEmployee.setDept(employeeDto.getDept());
        exitOldEmployee = employeeRepository.save(exitOldEmployee);
        return exitOldEmployee;
    }


}
