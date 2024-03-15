package com.avalanche.employee.repository;

import com.avalanche.employee.model.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends CrudRepository <Vehicle, Long> {
}
