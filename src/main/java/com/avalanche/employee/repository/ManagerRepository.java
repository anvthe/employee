package com.avalanche.employee.repository;

import com.avalanche.employee.model.Manager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends CrudRepository <Manager, Long> {
}
