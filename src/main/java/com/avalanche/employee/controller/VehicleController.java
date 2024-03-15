package com.avalanche.employee.controller;

import com.avalanche.employee.dto.VehicleDto;
import com.avalanche.employee.repository.VehicleRepository;
import com.avalanche.employee.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicles")

public class VehicleController {
    @Autowired
    private VehicleRepository repository;

    @Autowired
    private VehicleService vehicleService;

    @PostMapping("/save")
    public HttpStatus save(@RequestBody VehicleDto vehicle){
        vehicleService.save(vehicle);
        return HttpStatus.OK;
    }


}
