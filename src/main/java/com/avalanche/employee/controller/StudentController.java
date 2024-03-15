package com.avalanche.employee.controller;


import com.avalanche.employee.model.Student;
import com.avalanche.employee.dto.StudentDto;
import com.avalanche.employee.repository.StudentRepository;
import com.avalanche.employee.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private  StudentRepository repository;


    @PostMapping("/save")
    public HttpStatus save (@RequestBody StudentDto student){
        studentService.save(student);
        return  HttpStatus.OK;
    }

    @GetMapping("/get-student/{id}")

        public StudentDto getStudent(@PathVariable Long id){
        return studentService.getStudent(id);

    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getALLStudents();

    }


}





