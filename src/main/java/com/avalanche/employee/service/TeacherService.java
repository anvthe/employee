package com.avalanche.employee.service;

import com.avalanche.employee.model.EmployeeDto;
import com.avalanche.employee.model.Teacher;
import com.avalanche.employee.model.TeacherDto;
import com.avalanche.employee.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public void save (TeacherDto teacher){
        Teacher t = new Teacher();
        t.setName(teacher.getName());
        t.setAge(teacher.getAge());
        t.setGender(teacher.getGender());
        t.setDept(teacher.getDept());
        teacherRepository.save(t);


    }





}
