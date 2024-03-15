package com.avalanche.employee.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String name;
    private int year;
    private String model;



}
