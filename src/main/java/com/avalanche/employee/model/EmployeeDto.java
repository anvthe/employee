package com.avalanche.employee.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    private String name;
    private Integer salary;
    private Integer age;
    private String gender;
    private String dept;

}