package com.avalanche.employee.service;

import com.avalanche.employee.model.Student;
import com.avalanche.employee.model.StudentDto;
import com.avalanche.employee.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    @Autowired
    private StudentRepository studentRepository;

    public void save(StudentDto student) {
        Student s = new Student();
        s.setName(student.getName());
        s.setRoll(student.getRoll());
        s.setAge(student.getAge());
        s.setGender(student.getGender());
        s.setDept(student.getDept());
        studentRepository.save(s);

    }

    public StudentDto getStudent(Long id){
        Student student = studentRepository.findById(id).orElseThrow();
        StudentDto studentDto = new StudentDto();
        studentDto.setName(student.getName());
        studentDto.setRoll(student.getRoll());
        studentDto.setAge(student.getAge());
        studentDto.setGender(student.getGender());
        studentDto.setDept(student.getDept());
        return studentDto;
    }

    public List<Student> getALLStudents() {
        return (List<Student>) studentRepository.findAll();
    }
}
