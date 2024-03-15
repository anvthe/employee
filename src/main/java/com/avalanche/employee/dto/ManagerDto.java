package com.avalanche.employee.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ManagerDto {

    private String name;
    private int age;
    private String gender;
    private String address;
}
