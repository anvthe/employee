package com.avalanche.employee.controller;

import com.avalanche.employee.dto.TeacherDto;
import com.avalanche.employee.repository.TeacherRepository;
import com.avalanche.employee.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teachers")

public class TeacherController {


    @Autowired
    private TeacherService teacherService;

    @Autowired
    private TeacherRepository repository;


/*
    @PostMapping("/save")
    public HttpStatus save (@RequestBody TeacherDto teacher){
        teacherService.save(teacher);
        return HttpStatus.OK;
    }
*/

    @PostMapping("/save")

    public HttpStatus save (@RequestBody TeacherDto teacher){

        teacherService.save(teacher);
        return HttpStatus.OK;
    }


}





