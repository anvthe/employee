package com.avalanche.employee.service;

import com.avalanche.employee.model.Vehicle;
import com.avalanche.employee.dto.VehicleDto;
import com.avalanche.employee.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    public void save (VehicleDto vehicle) {
        Vehicle v = new Vehicle();

        v.setName(vehicle.getName());
        v.setYear(vehicle.getYear());
        v.setModel(vehicle.getModel());
        vehicleRepository.save(v);


    }






}
