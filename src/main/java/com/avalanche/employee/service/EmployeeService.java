package com.avalanche.employee.service;

import com.avalanche.employee.model.Employee;
import com.avalanche.employee.model.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.avalanche.employee.repository.EmployeeRepository;
import java.util.List;


@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    //save employee
    public void save(EmployeeDto employee) {
        Employee e = new Employee();
        e.setName(employee.getName());
        e.setSalary(employee.getSalary());
        e.setAge(employee.getAge());
        e.setGender(employee.getGender());
        e.setDept(employee.getDept());
        employeeRepository.save(e);
    }

    //get employee by id
    public EmployeeDto getEmployee(Long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow();
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setName(employee.getName());
        employeeDto.setAge(employee.getAge());
        return employeeDto;
    }

    //update by ID
    public Employee updateEmployee(Long id, EmployeeDto employeedto) {

        Employee existOldEmployee = employeeRepository.findById(id).orElseThrow();

        existOldEmployee.setName(employeedto.getName());
        existOldEmployee.setSalary(employeedto.getSalary());
        existOldEmployee.setAge(employeedto.getAge());
        existOldEmployee.setGender(employeedto.getGender());
        existOldEmployee.setDept(employeedto.getDept());

        existOldEmployee = employeeRepository.save(existOldEmployee);

        return existOldEmployee;
    }

    //delete employee by id
    public EmployeeDto deleteEmployee(Long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow();

        employeeRepository.delete(employee);

        return null;
    }

    public List<Employee> getAllEmployees(){
        //List<Employee> employee = (List<Employee>) new Employee();
        //employeeRepository.findAll();
        return (List<Employee>) employeeRepository.findAll();
    }
}
