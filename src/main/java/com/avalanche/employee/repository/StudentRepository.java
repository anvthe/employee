package com.avalanche.employee.repository;

import com.avalanche.employee.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface StudentRepository extends CrudRepository <Student, Long>{
}
