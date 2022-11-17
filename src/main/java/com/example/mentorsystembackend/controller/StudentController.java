package com.example.mentorsystembackend.controller;

import com.example.mentorsystembackend.model.student;
import com.example.mentorsystembackend.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/v1/student/")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
// get all students
    @GetMapping(path = "/")
    public List<student> getAllStudent(){
       return studentRepository.findAll();
    }
}
